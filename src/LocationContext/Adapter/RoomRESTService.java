package LocationContext.Adapter;

import LocationContext.Application.RoomApplicationService;
import LocationContext.domain.Desk;
import LocationContext.domain.DeskType;
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

    public void addDeskToRoom(long roomId, long adminId, long locationId, long floorId, long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, DeskType deskType){
        Desk desk = roomApplicationService.addDeskToRoom(adminId, roomId, deskId, computerUsable, currentlyUsable, sockets, floorId,  deskType, locationId);
    }
}