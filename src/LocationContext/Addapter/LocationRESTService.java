package LocationContext.Addapter;

import LocationContext.Application.RoomApplicationService;
import LocationContext.domain.Room;

public class LocationRESTService {
    public RoomApplicationService roomApplicationService;

    public LocationRESTService(){
        this.roomApplicationService = new RoomApplicationService();
    }

    public Room roomUnavailable(Long roomId){
        roomApplicationService.roomUnavailable(roomId);
        return new Room();
    }
}
