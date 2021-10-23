package SelfReservationContext.Domain.Repositories;

import SelfReservationContext.Domain.Reservation;

public interface ReservationRepository {

    public boolean save(Reservation reservation);

    public Reservation findReservationByDesk(Long deskId);
}
