package LocationContext.Application;

import IdentityAndAccessContext.Adapter.IdentitiAndAccessRESTService;
import LocationContext.domain.Desk;
import LocationContext.domain.DeskType;
import LocationContext.domain.Floor;
import LocationContext.domain.Room;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.RoomRepository;
import SelfReservationContext.Adapter.RestService;

public class DeskApplicationService {
    public static final DeskApplicationService deskApplicationService = new DeskApplicationService();

    public static boolean addDeskToRoom(long adminId, Long roomId, long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Floor floor, DeskType deskType) {

        boolean validateAdmin = IdentitiAndAccessRESTService.validateAdminID(adminId);
        boolean deskExsists = DeskRepository.deskExists(deskId);
        boolean roomExists = RoomRepository.roomExists(roomId);


        if (validateAdmin && !deskExsists && roomExists) {

            Room room = RoomRepository.getRoomById(roomId);
            Desk d = room.addDesk(deskId, computerUsable, currentlyUsable, sockets, floor, deskType);
            return true;
        }
        return false;

    }
        





    public void closedDesk(Long deskId){
        RestService.restService.closedDesk(deskId);
    }

}
