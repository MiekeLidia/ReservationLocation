package SelfReservationContext.Adapter;

import java.sql.Date;
import java.sql.Time;

import SelfReservationContext.Domain.Reservation;
import AccountContext.EmployeeRestService.EmployeeRestService;
import SelfReservationContext.Application.ReservationApplicationService;

public class RestService {
    public static final RestService restService = new RestService();
    private final ReservationApplicationService reservationService;

    public RestService(){
        this.reservationService = new ReservationApplicationService();
    }

    public void bookReservation(Date date, Time time,  Time amountTime, Long employeeId, Long deskId ){
        if (reservationService.checkDeskAvailability(deskId, time, date, amountTime)){
            Reservation reservation = new Reservation(date, time, amountTime, employeeId, deskId);
        }


    }

    public void closedDesk(Long deskId){
        reservationService.cancelReservation(deskId);
        EmployeeRestService.employeeRestService.reservationCancelled();
    }
}
