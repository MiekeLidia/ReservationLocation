package ReservationContext.Application;

import ReservationContext.Data.ReservationRepository;
import ReservationContext.Domain.Reservation;

public class ReservationApplicationService {
    private final ReservationRepository resRepository;

    public ReservationApplicationService(){
        this.resRepository = new ReservationRepository();
    }

    public void cancelReservation(Long deskId){
        Reservation reservation = resRepository.findReservationByDesk(deskId);

        reservation.cancelReservation();

        resRepository.save(reservation);
    }
}
