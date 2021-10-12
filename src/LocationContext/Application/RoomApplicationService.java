package LocationContext.Application;

import LocationContext.domain.Desk;
import LocationContext.domain.Room;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.RoomRepository;

public class RoomApplicationService {
    public final RoomRepository roomRepository;
    public final DeskRepository deskRepository;

    public RoomApplicationService(){
        this.roomRepository = new RoomRepository();
        this.deskRepository = new DeskRepository();
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
}
