package LocationContext.infrastructure.persistence;

import LocationContext.domain.Floor;
import LocationContext.domain.Room;
import LocationContext.domain.repositories.FloorRepository;

import java.util.ArrayList;

public class HibernateFloorRepository implements FloorRepository {
    @Override
    public boolean save(Floor floor) {
        System.out.println("Saving room...");
        return false;
    }

    @Override
    public Floor getFloorById(Long floor) {
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room());
        rooms.add(new Room());
        rooms.add(new Room());
        return new Floor(rooms);

    }
}
