package LocationContext.Application;

import LocationContext.domain.Desk;
import LocationContext.domain.DeskType;
import LocationContext.domain.Room;
import LocationContext.domain.repositories.RoomRepository;
import SelfReservationContext.Adapter.RestService;

public class DeskApplicationService {
    public static final DeskApplicationService deskApplicationService = new DeskApplicationService();

    public boolean addDeskToRoom(long roomId, long adminId, long locationId, long floorId, long deskId, boolean computer, boolean socket, DeskType deskType){
        Room room = RoomRepository.findById(roomId);

        if (adminId in adminList && roomId.Exists && deskId.Exists){
            Desk d = room.addDesk(locationId, floorId, deskId, computer, socket, deskType);
        }
    }

    public void store(){}

    public void closedDesk(Long deskId){
        RestService.restService.closedDesk(deskId);
    }

}
