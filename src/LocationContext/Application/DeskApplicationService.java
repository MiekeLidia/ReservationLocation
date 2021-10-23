package LocationContext.Application;

import IdentityAndAccessContext.Adapter.IdentitiAndAccessRESTService;
import LocationContext.domain.*;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.FloorRepository;
import LocationContext.domain.repositories.LocationRepository;
import LocationContext.domain.repositories.RoomRepository;
import SelfReservationContext.Adapter.RestService;

public class DeskApplicationService {
    public final DeskApplicationService deskApplicationService = new DeskApplicationService();
    public final DeskRepository deskRepository;
    public final RoomRepository roomRepository;


    public DeskApplicationService(DeskRepository deskRepository, RoomRepository roomRepository) {
        this.deskRepository = deskRepository;
        this.roomRepository = roomRepository;
    }

    public boolean addDeskToRoom(long adminId, Long roomId, long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Floor floor, DeskType deskType) {


        try{
//            Location location = locationRepository.getLocationById(locationId);
//            Floor floor = floorRepository.getFloorById(floorId);
            RoomApplicationService.addDeskToRoom(adminId, roomId, deskId, computerUsable, currentlyUsable, sockets, floor, deskType);
            return true;
        }catch (Exeption e){
            return false;
        }



//        boolean validateAdmin = IdentitiAndAccessRESTService.validateAdminID(adminId);
//        Desk desk = deskRepository.getDeskById(deskId);
//        Room room = roomRepository.getRoomById(roomId);

//        if (desk == null && validateAdmin && room != null){
//            Desk d = room.addDesk(deskId, computerUsable, currentlyUsable, sockets, floor, deskType);
//            return true;
//        }
//        return false;
    }
        

    public void closedDesk(Long deskId){
        RestService.restService.closedDesk(deskId);
    }

}
