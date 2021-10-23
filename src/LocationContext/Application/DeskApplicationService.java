package LocationContext.Application;

import LocationContext.domain.*;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.RoomRepository;
import ReservationContext.Adapter.ReservationRESTService;

public class DeskApplicationService {
    private final DeskRepository deskRepository;
    private final RoomRepository roomRepository;
    private RoomApplicationService roomApplicationService;
    public DeskApplicationService(DeskRepository deskRepository, RoomRepository roomRepository) {
        this.deskRepository = deskRepository;
        this.roomRepository = roomRepository;
    }

    public void setRoomApplicationService(RoomApplicationService roomApplicationService){
        this.roomApplicationService = roomApplicationService;
    }

//    public boolean addDeskToRoom(long roomId, long adminId, long locationId, long floorId, long deskId, boolean computer, boolean socket, DeskType deskType){
//        //boolean validateAdmin = IdentitiAndAccessRESTService.validateAdminID(adminId);
//        Room room = roomRepository.findById(roomId);
//
//
//        if(roomRepository.findById(roomId) == null) {
//                                         //&& validateAdmin == true
//            Desk newDesk;
//            if (deskRepository.findById(deskId) == null){
//                newDesk = room.addDesk(deskId, computer, true, socket, floorId, deskType, locationId);
//                deskRepository.save(newDesk);
//                roomRepository.save(room);
//                return true;
//            }
//        }
//        return false;
//    }

    public void closedDesk(Long deskId){
//        ReservationRESTService.RESERVATION_REST_SERVICE.closedDesk(deskId);
    }

}
