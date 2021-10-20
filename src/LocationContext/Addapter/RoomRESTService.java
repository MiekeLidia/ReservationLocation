package LocationContext.Addapter;

import LocationContext.Application.RoomApplicationService;
import LocationContext.domain.Room;

public class RoomRESTService {

    public RoomApplicationService roomApplicationService;

    public RoomRESTService(){
        this.roomApplicationService = new RoomApplicationService();
    }

    public Room roomUnavailable(Long roomId){
        roomApplicationService.roomUnavailable(roomId);
        return new Room();
    }
}
