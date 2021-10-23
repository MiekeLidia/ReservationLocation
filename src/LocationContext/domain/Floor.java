package LocationContext.domain;

import java.util.List;

public class Floor {
    private Long floorId;
    private int floorNr;
    private boolean currentleyUsable;
    private List<Room> rooms;

    public Floor(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void assignRoom() {
        Room room = new Room();
        rooms.add(room);
    }
}
