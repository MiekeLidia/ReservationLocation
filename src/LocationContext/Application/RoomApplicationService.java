package LocationContext.Application;

import IdentityAndAccessContext.Adapter.IdentitiAndAccessRESTService;
import LocationContext.domain.*;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.RoomRepository;
import LocationContext.infrastructure.persistence.HibernateDeskRepository;
import LocationContext.infrastructure.persistence.HibernateRoomRepository;

public class RoomApplicationService {
    public final DeskRepository deskRepository;
    public final RoomRepository roomRepository;

    public RoomApplicationService(RoomRepository roomRepository, DeskRepository deskRepository){
        this.roomRepository = roomRepository;
        this.deskRepository = deskRepository;
    }

    public Room roomUnavailable(Long roomId) {
        Room room = roomRepository.getRoomById(roomId);
        room.roomUnavailable();

        for (Desk desk : room.getDesks()) {
            deskRepository.save(desk);
        }
        roomRepository.save(room);
        return room;
    }

    public Desk addDeskToRoom(long adminId, Long roomId, long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Long floorId, DeskType deskType, Long locationId) {
        boolean validateAdmin = IdentitiAndAccessRESTService.validateAdminID(adminId);
        Desk desk = deskRepository.getDeskById(deskId);
        Room room = roomRepository.getRoomById(roomId);

        if (desk == null && validateAdmin && room != null){
            room.addDesk(deskId, computerUsable, currentlyUsable, sockets, floorId, deskType, locationId);
        }
        return null;
    }
}
