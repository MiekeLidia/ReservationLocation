package LocationContext.domain;

import LocationContext.Application.DeskApplicationService;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.RoomRepository;

import java.util.List;

public class Room {
    private Long roomId;
    private int roomNumber;
    private boolean publicRoom;
    private  boolean currentlyUsable;
    private boolean beamer;
    private List<Desk> desks;
    RoomRepository roomRepository;

    public Room(){}
    public Room(List<Desk> desks){ this.desks = desks;}

    public List<Desk> getDesks() { return desks; }

    public Desk addDesk(long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Long floorId, DeskType deskType, Long locationId){
        Desk newDesk = new Desk(deskId, computerUsable, currentlyUsable, sockets, floorId, deskType,  this.roomId, locationId);
        this.desks.add(newDesk);
        return newDesk;
//    public Desk addDesk(long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Floor floor, DeskType deskType){
//        Desk newDesk = new Desk(deskId, computerUsable, currentlyUsable, sockets, floor, deskType,  this);
//        desks.add(newDesk);
//        return newDesk;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setCurrentlyUsable(Boolean available){
        this.currentlyUsable = available;
    }

    public Room roomUnavailable(DeskApplicationService deskService){
        setCurrentlyUsable(false);
        for(Desk desk: desks){
            desk.currentlyUnavailable(deskService);
        }
        return this;
    }

}
