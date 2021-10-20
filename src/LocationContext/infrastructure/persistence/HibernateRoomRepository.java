package LocationContext.infrastructure.persistence;

import LocationContext.domain.Room;
import LocationContext.domain.repositories.RoomRepository;

public class HibernateRoomRepository implements RoomRepository {

    @Override
    public boolean save(Room room) {
        return false;
    }

    @Override
    public Room getRoomById(Long roomId) {
        return null;
    }
}
