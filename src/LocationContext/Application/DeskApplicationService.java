package LocationContext.Application;

import LocationContext.domain.Desk;
import LocationContext.domain.DeskType;
import LocationContext.domain.Room;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.RoomRepository;
import SelfReservationContext.Adapter.RestService;

public class DeskApplicationService {
    public static final DeskApplicationService deskApplicationService = new DeskApplicationService();

    public boolean addDeskToRoom(long roomId, long adminId, long locationId, long floorId, long deskId, boolean computer, boolean socket, DeskType deskType){

        boolean validateAdmin = validateAdminID(adminId);
        boolean deskExsists = DeskRepository.deskExists(deskId);
        boolean roomExists = RoomRepository.roomExists(roomId);



        if (validateAdmin == true && deskExsists == false && roomExists == true){

            Room room = RoomRepository.getRoomById(roomId);
            Desk d = room.addDesk(locationId, floorId, deskId, computer, socket, deskType);
        }
        
    }




    public void closedDesk(Long deskId){
        RestService.restService.closedDesk(deskId);
    }

}
