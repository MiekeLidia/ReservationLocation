package ReservationContext.Domain.Repositories;

import ReservationContext.Domain.Reservation;

public interface ReservationRepository {

    public boolean save(Reservation reservation);

    public Reservation findReservationByDesk(Long deskId);
}
