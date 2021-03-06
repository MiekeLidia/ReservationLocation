package LocationContext.domain.repositories;

import LocationContext.domain.Room;

public interface RoomRepository {
    public boolean save(Room room);

    public Room findById(Long roomId);
}
