package LocationContext.Application;

import LocationContext.domain.*;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.FloorRepository;
import LocationContext.domain.repositories.RoomRepository;

public class RoomApplicationService {
    private final DeskRepository deskRepository;
    private final RoomRepository roomRepository;
    private final FloorRepository floorRepository;
    private DeskApplicationService deskApplicationService;

    public RoomApplicationService(RoomRepository roomRepository, DeskRepository deskRepository, FloorRepository floorRepository){
        this.roomRepository = roomRepository;
        this.deskRepository = deskRepository;
        this.floorRepository = floorRepository;
    }

    public Room roomUnavailable(Long roomId) {
        Room room = roomRepository.getRoomById(roomId);
        room.roomUnavailable(deskApplicationService);

        for (Desk desk : room.getDesks()) {
            deskRepository.save(desk);
        }
        roomRepository.save(room);
        return room;
    }

    public Desk addDeskToRoom(long adminId, Long roomId, long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Long floorId, DeskType deskType, Long locationId) {
        Desk desk = deskRepository.findById(deskId);
        Room room = roomRepository.getRoomById(roomId);

        if (desk == null && room != null){
            room.addDesk(deskId, computerUsable, currentlyUsable, sockets, floorId, deskType, locationId);
        }
        return null;
    }

    public void setDeskApplicationService(DeskApplicationService deskApplicationService){
        this.deskApplicationService = deskApplicationService;
    }

    public void assignRoomToFloor(Long floorId, Long roomId) {
        Floor floor = floorRepository.getFloorById(floorId);
        Room room = roomRepository.getRoomById(roomId);

        try{
            if (floor != null && room != null){
                floor.assignRoom();
            }
        }catch (Exception e){
            e.getMessage();
        }

        floorRepository.save(floor);
    }
}
