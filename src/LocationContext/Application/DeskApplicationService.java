package LocationContext.Application;

import IdentityAndAccessContext.Adapter.IdentitiAndAccessRESTService;
import LocationContext.domain.*;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.FloorRepository;
import LocationContext.domain.repositories.LocationRepository;
import LocationContext.domain.repositories.RoomRepository;
import SelfReservationContext.Adapter.RestService;

public class DeskApplicationService {
    public final DeskRepository deskRepository;
    public final RoomRepository roomRepository;


    public DeskApplicationService(DeskRepository deskRepository, RoomRepository roomRepository) {
        this.deskRepository = deskRepository;
        this.roomRepository = roomRepository;
    }
        

    public void closedDesk(Long deskId){
        RestService.restService.closedDesk(deskId);
    }

}
