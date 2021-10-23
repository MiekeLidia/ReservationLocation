package ReservationContext.Application;

import ReservationContext.Domain.Repositories.ReservationRepository;
import ReservationContext.Domain.Reservation;
import java.sql.Date;
import java.sql.Time;

public class ReservationApplicationService {
    private final ReservationRepository reservationRepository;

    public ReservationApplicationService(ReservationRepository reservationRepository){
        this.reservationRepository = reservationRepository;
    }

    public boolean checkDeskAvailability(Long deskId, Time time, Date date, Time amountTime){
        Reservation reservation = reservationRepository.findReservationByDesk(deskId);
        if (reservation.date.equals(date) && reservation.startTime.equals(time)){
            return false;
        }
        return true;
    }

    public void cancelReservation(Long deskId){
        Reservation reservation = reservationRepository.findReservationByDesk(deskId);

        reservation.cancelReservation();

        reservationRepository.save(reservation);
    }
}
