package LocationContext.domain;

import java.util.List;

public class Room {
    private Long roomId;
    private int roomNumber;
    private boolean publicRoom;
    private  boolean currentlyUsable;
    private boolean beamer;
    private List<Desk> desks;

    public Room(){}
    public Room(List<Desk> desks){ this.desks = desks;}

    public List<Desk> getDesks() { return desks; }

    public Desk addDesk(long locationId, long floorId, long deskId, boolean computer, boolean socket, DeskType deskType){
        Desk newDesk = new Desk(locationId, floorId, deskId, computer,deskType, socket);
        desks.add(newDesk);
        return newDesk;
    }

    public void setCurrentlyUsable(Boolean available){
        this.currentlyUsable = available;
    }

    public Room roomUnavailable(){
        setCurrentlyUsable(false);
        for(Desk desk: desks){
            desk.currentlyUnavailable();
        }
        return this;
    }

}
