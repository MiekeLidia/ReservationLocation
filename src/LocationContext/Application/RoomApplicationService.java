package LocationContext.Application;

import LocationContext.domain.*;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.RoomRepository;

public class RoomApplicationService {
    public final DeskRepository deskRepository;
    public final RoomRepository roomRepository;

    public RoomApplicationService(DeskRepository deskRepository, RoomRepository roomRepository) {
        this.deskRepository = deskRepository;
        this.roomRepository = roomRepository;
    }

    public Room roomUnavailable(Long roomId){
        Room room = roomRepository.getRoomById(roomId);
        room.roomUnavailable();

        for(Desk desk: room.getDesks()){
            deskRepository.save(desk);
        }

        roomRepository.save(room);

        return room;
    }

    public boolean addDeskToRoom(long adminId, Long roomId, long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Long floorId, DeskType deskType, Long locationId) {

        try {
            DeskApplicationService.addDeskToRoom(adminId, roomId, deskId, computerUsable, currentlyUsable, sockets, floorId, deskType, locationId);
            return true;
        } catch (Exeption e) {
            return false;
        }
    }

}
