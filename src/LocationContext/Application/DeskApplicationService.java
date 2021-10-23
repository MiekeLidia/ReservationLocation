package LocationContext.Application;

import IdentityAndAccessContext.Adapter.IdentitiAndAccessRESTService;
import LocationContext.domain.Desk;
import LocationContext.domain.DeskType;
import LocationContext.domain.Floor;
import LocationContext.domain.Room;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.FloorRepository;
import LocationContext.domain.repositories.LocationRepository;
import LocationContext.domain.repositories.RoomRepository;
import SelfReservationContext.Adapter.RestService;

public class DeskApplicationService {
    public static final DeskApplicationService deskApplicationService = new DeskApplicationService();
    public final DeskRepository deskRepository;
    public final RoomRepository roomRepository;

    public boolean addDeskToRoom(long adminId, Long roomId, long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Floor floor, DeskType deskType) {

        boolean validateAdmin = IdentitiAndAccessRESTService.validateAdminID(adminId);
        Desk desk = deskRepository.getDeskById(deskId);
        Room room = roomRepository.getRoomById(roomId);

        if (desk == null && validateAdmin && room != null){
            Desk d = room.addDesk(deskId, computerUsable, currentlyUsable, sockets, floor, deskType);
            return true;
        }
        return false;
    }
        

    public void closedDesk(Long deskId){
        RestService.restService.closedDesk(deskId);
    }

}
