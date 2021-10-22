package LocationContext.Addapter;

import LocationContext.Application.DeskApplicationService;
import LocationContext.Application.RoomApplicationService;
import LocationContext.domain.DeskType;
import LocationContext.domain.Floor;
import LocationContext.domain.Location;
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

    public boolean addDeskToRoom(long roomId, long adminId, long locationId, long floorId, long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, DeskType deskType){
        try{
            Location location = findLocationById(locationId);
            Floor floor = findFloorById(floorId);
            DeskApplicationService.addDeskToRoom(adminId, roomId, deskId, computerUsable, currentlyUsable, sockets, floor, deskType);
            return true;
        }catch (Exeption e){
            return false;
        }

    }
}
