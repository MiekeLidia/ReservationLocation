package SelfReservationContext.Application;

import java.sql.Date;
import java.sql.Time;

import LocationContext.Application.DeskApplicationService;
import LocationContext.domain.repositories.DeskRepository;
import SelfReservationContext.Domain.Reservation;
import SelfReservationContext.Domain.Repositories.ReservationRepository;


public class ReservationApplicationService {
    private final ReservationRepository resRepository;
    private final DeskRepository deskRepository;

    public ReservationApplicationService(ReservationRepository reservationRepository, DeskRepository deskRepository){
        this.resRepository = reservationRepository;
        this.deskRepository = deskRepository;
    }

    public boolean checkDeskAvailability(Long deskId, Time time, Date date, Time amountTime){
        Reservation reservation = resRepository.findReservationByDesk(deskId);
        if (reservation.date.equals(date) && reservation.startTime.equals(time)){
            return false;
        }
        return true;
    }

    public void cancelReservation(Long deskId){
        Reservation reservation = resRepository.findReservationByDesk(deskId);

        reservation.cancelReservation();

        resRepository.save(reservation);
    }
}
