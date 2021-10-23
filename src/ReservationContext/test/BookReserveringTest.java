package ReservationContext.test;

import java.beans.Transient;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;

import ReservationContext.Application.ReservationApplicationService;
import ReservationContext.Domain.Repositories.ReservationRepository;
import ReservationContext.Infrastructure.Persistence.HibernateReservationRepository;

public class BookReserveringTest {
    private static ReservationRepository reservationRepository;

    @Test
    public void boekReservering(){
        reservationRepository = new HibernateReservationRepository();
        
        Long deskId = 1L;
        Time time = new Time(8,30,0);
        Date date = new Date(20210101);
        Long amountTime = 100L;
        Long employeeId = 1234L;

        Reservation reservation = new Reservation(deskId, time, date, amountTime, employeeId);
        
        //boeking maken
        boolean test1 = ReservationApplicationService.bookReservation(reservation);
        assertTrue(test1);

        //boeking bestaat al
        boolean test2 = ReservationApplicationService.bookReservation(reservation);
        assertFalse(test1);
    }
    
    
}
