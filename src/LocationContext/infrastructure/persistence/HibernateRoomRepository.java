package LocationContext.infrastructure.persistence;

import LocationContext.domain.Desk;
import LocationContext.domain.Room;
import LocationContext.domain.repositories.RoomRepository;

import java.util.ArrayList;

public class HibernateRoomRepository implements RoomRepository {

    @Override
    public boolean save(Room room) {
        System.out.println("Saving room...");
        return true;
    }

    @Override
    public Room getRoomById(Long roomId) {
        System.out.println("Getting Room: " + roomId + "...");

        ArrayList<Desk> desks = new ArrayList<Desk>();
        desks.add(new Desk(1L));
        desks.add(new Desk(2L));
        desks.add(new Desk(3L));
        return new Room(desks);
    }
}
