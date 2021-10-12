package LocationContext.domain.repositories;

import LocationContext.domain.Desk;
import LocationContext.domain.Room;

import java.util.ArrayList;

public class RoomRepository {

    public boolean save(Room room){
        System.out.println("Room Saved!");
        return true;
    }

    public Room getRoomById(Long roomId){
        ArrayList<Desk> desks = new ArrayList<>();
        Desk desk1 = new Desk(1L);
        Desk desk2 = new Desk(2L);
        Desk desk3 = new Desk(3L);
        desks.add(desk1);
        desks.add(desk2);
        desks.add(desk3);

        return new Room(desks);
    }

}
