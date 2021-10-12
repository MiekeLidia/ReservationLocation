package LocationContext.Application;

import SelfReservationContext.Adapter.RestService;

public class DeskApplicationService {
    public static final DeskApplicationService deskApplicationService = new DeskApplicationService();

    public void closedDesk(Long deskId){
        RestService.restService.closedDesk(deskId);
    }

}
