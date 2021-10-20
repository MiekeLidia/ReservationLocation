package LocationContext.Addapter;

import LocationContext.Application.RoomApplicationService;
import LocationContext.domain.DeskType;
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

    public boolean addDeskToRoom(long roomId, long adminId, long locationId, long floorId, long deskId, boolean computer, boolean socket, DeskType deskType){
//        try{
//            DeskApplicationServicek.addDeskToRoom(roomId, adminId, locationId, floorId, deskId, computer, socket, deskType);
//            return true;
//        }catch (Exeption e){
//            return false;
//        }
        return false;
    }
}
