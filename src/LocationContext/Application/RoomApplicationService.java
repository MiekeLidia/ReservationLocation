package LocationContext.Application;

import LocationContext.domain.Desk;
import LocationContext.domain.Room;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.infrastructure.persistence.HibernateRoomRepository;

public class RoomApplicationService {
    public final HibernateRoomRepository roomRepository;
    public final DeskRepository deskRepository;

    public RoomApplicationService(){
        this.roomRepository = new HibernateRoomRepository();
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
