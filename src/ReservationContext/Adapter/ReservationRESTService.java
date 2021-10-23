package ReservationContext.Adapter;

import java.sql.Date;
import java.sql.Time;

import AccountContext.EmployeeRestService.EmployeeRestService;
import ReservationContext.Application.ReservationApplicationService;
import ReservationContext.Domain.Reservation;

public class ReservationRESTService {
//    public static final ReservationRESTService RESERVATION_REST_SERVICE = new ReservationRESTService();
    private final ReservationApplicationService reservationService;

    public ReservationRESTService(ReservationApplicationService reservationService){
        this.reservationService = reservationService;
    }

    public void bookReservation(Date date, Time time,  Time amountTime, Long employeeId, Long deskId ){
        if (reservationService.checkDeskAvailability(deskId, time, date, amountTime)){
            Reservation reservation = new Reservation();
        }


    }

    public void closedDesk(Long deskId){
        reservationService.cancelReservation(deskId);
        EmployeeRestService.employeeRestService.reservationCancelled();
    }
}
