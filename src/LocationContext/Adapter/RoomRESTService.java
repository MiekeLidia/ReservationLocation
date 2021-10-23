package LocationContext.Adapter;

import LocationContext.Application.DeskApplicationService;
import LocationContext.Application.RoomApplicationService;
import LocationContext.domain.DeskType;
import LocationContext.domain.Room;

public class RoomRESTService {
    public RoomApplicationService roomApplicationService;
    public DeskApplicationService deskApplicationService;

    public RoomRESTService(RoomApplicationService applicationService){
        this.roomApplicationService = applicationService;
    }

    public Room roomUnavailable(Long roomId){
        roomApplicationService.roomUnavailable(roomId);
        return new Room();
    }

    public Room addDeskToRoom(long roomId, long adminId, long locationId, long floorId, long deskId, boolean computer, boolean sockets, DeskType deskType){
        deskApplicationService.addDeskToRoom(adminId, roomId, deskId, computer, sockets, locationId, floorId, deskType);
        return new Room();
    }
}
