package LocationContext.Adapter;

import LocationContext.Application.RoomApplicationService;
import LocationContext.domain.DeskType;
import LocationContext.domain.Room;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.RoomRepository;

public class LocationRESTService {
    public RoomApplicationService roomApplicationService;

    public LocationRESTService(RoomApplicationService roomApplicationService) {
        this.roomApplicationService = roomApplicationService;

    }

    public Room roomUnavailable(Long roomId) {
        roomApplicationService.roomUnavailable(roomId);
        return new Room();
    }

    public boolean assignRoomToFloor(Long floorId, Long roomId) {
        try {
            roomApplicationService.assignRoomToFloor(floorId, roomId);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
}
