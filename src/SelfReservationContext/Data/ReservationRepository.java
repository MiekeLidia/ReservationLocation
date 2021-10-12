package SelfReservationContext.Data;

import SelfReservationContext.Domain.Reservation;

public class ReservationRepository {

    public boolean save(Reservation reservation) {
        System.out.println("Saving reservation...");
        return true;
    }

    public Reservation findReservationByDesk(Long deskId){
        return new Reservation();
    }
}
