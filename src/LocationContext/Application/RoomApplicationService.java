package LocationContext.Application;

import LocationContext.domain.Desk;
import LocationContext.domain.Room;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.RoomRepository;
import LocationContext.infrastructure.persistence.HibernateDeskRepository;
import LocationContext.infrastructure.persistence.HibernateRoomRepository;

public class RoomApplicationService {
    public final RoomRepository roomRepository;
    public final DeskRepository deskRepository;

    public RoomApplicationService(RoomRepository roomRepository, DeskRepository deskRepository){
        this.roomRepository = roomRepository;
        this.deskRepository = deskRepository;
    }

    public Room roomUnavailable(Long roomId){
        Room room = roomRepository.getRoomById(roomId);
        room.roomUnavailable();

        for(Desk desk: room.getDesks()){
            deskRepository.save(desk);
        }
        roomRepository.save(room);

        // publisher.publishRetrievalOf

        return room;
    }
}
