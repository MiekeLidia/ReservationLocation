package SelfReservationContext.Infrastructure.Persistence;

import SelfReservationContext.Domain.Reservation;
import SelfReservationContext.Domain.Repositories.ReservationRepository;

public class HibernateReservationRepository implements ReservationRepository{

    @Override
    public boolean save(Reservation reservation) {
        System.out.println("Saving reservation...");
        return true;
    }

    @Override
    public Reservation findReservationByDesk(Long deskId) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
