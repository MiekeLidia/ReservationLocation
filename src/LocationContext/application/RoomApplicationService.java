package LocationContext.application;

import LocationContext.domain.*;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.FloorRepository;
import LocationContext.domain.repositories.RoomRepository;

public class RoomApplicationService {
    public final DeskRepository deskRepository;
    public final RoomRepository roomRepository;
    public final FloorRepository floorRepository;

    public RoomApplicationService(DeskRepository deskRepository, RoomRepository roomRepository, FloorRepository floorRepository) {
        this.deskRepository = deskRepository;
        this.roomRepository = roomRepository;
        this.floorRepository = floorRepository;
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

//    public boolean addDeskToRoom(long adminId, Long roomId, long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Long floorId, DeskType deskType, Long locationId) {
//        Desk desk = new Desk(deskId, computerUsable, currentlyUsable, sockets, floorId, deskType, locationId);
//
//    }

    public void assignRoomToFloor(Long locationId, Long floorId, Long roomId) {
        Floor floor = floorRepository.getFloorById(floorId);
    }
}
