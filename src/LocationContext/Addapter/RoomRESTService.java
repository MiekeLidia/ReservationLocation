package LocationContext.Addapter;

import LocationContext.Application.RoomApplicationService;
import LocationContext.domain.Room;

public class RoomRESTService {

    public RoomApplicationService roomApplicationService;

    public RoomRESTService(RoomApplicationService applicationService){
        this.roomApplicationService = applicationService;
    }

    public Room roomUnavailable(Long roomId){
        roomApplicationService.roomUnavailable(roomId);
        return new Room();
    }
}
