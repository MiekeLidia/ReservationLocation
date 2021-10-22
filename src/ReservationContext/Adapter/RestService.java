package ReservationContext.Adapter;

import AccountContext.EmployeeRestService.EmployeeRestService;
import ReservationContext.Application.ReservationApplicationService;

public class RestService {
    public static final RestService restService = new RestService();
    private final ReservationApplicationService reservationService;

    public RestService(){
        this.reservationService = new ReservationApplicationService();
    }

    public void closedDesk(Long deskId){
        reservationService.cancelReservation(deskId);
        EmployeeRestService.employeeRestService.reservationCancelled();
    }
}
