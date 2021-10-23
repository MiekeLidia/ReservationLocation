package LocationContext.Application;

import LocationContext.domain.*;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.FloorRepository;
import LocationContext.domain.repositories.LocationRepository;
import LocationContext.domain.repositories.RoomRepository;
import ReservationContext.Adapter.RestService;

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

    public boolean addDeskToRoom(long roomId, long adminId, long locationId, long floorId, long deskId, boolean computer, boolean socket, DeskType deskType){
//        Room room = RoomRepository.findById(roomId);
//
//        if (adminId in adminList && roomId.Exists && deskId.Exists){
//            Desk d = room.addDesk(locationId, floorId, deskId, computer, socket, deskType);
//        }
        return false;
    }

    public void store(){}

    public void closedDesk(Long deskId){
        RestService.restService.closedDesk(deskId);
    }

}
