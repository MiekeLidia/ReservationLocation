package LocationContext.domain;

import LocationContext.Application.DeskApplicationService;

public class Desk {
    private Long deskId;
    private boolean computerUsable;
    private boolean currentlyUsable;
    private boolean sockets;
    private Floor floor;
    private DeskType deskType;
    private Room room;

    public Desk(Long deskId){
        this.deskId = deskId;
    }

    public Desk(Long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Floor floor, DeskType deskType, Room room) {
        this.deskId = deskId;
        this.computerUsable = computerUsable;
        this.currentlyUsable = currentlyUsable;
        this.sockets = sockets;
        this.floor = floor;
        this.deskType = deskType;
        this.room = room;
    }

    public Desk(long locationId, long floorId, long deskId, boolean computer, boolean socket, DeskType deskType) {
    }

    public Long getDeskId() {
        return deskId;
    }

    public void setDeskId(Long deskId) {
        this.deskId = deskId;
    }

    public boolean isComputerUsable() {
        return computerUsable;
    }

    public void setComputerUsable(boolean computerUsable) {
        this.computerUsable = computerUsable;
    }

    public boolean isCurrentlyUsable() {
        return currentlyUsable;
    }

    public void setCurrentlyUsable(boolean currentlyUsable) {
        this.currentlyUsable = currentlyUsable;
    }

    public boolean isSockets() {
        return sockets;
    }

    public void setSockets(boolean sockets) {
        this.sockets = sockets;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public DeskType getDeskType() {
        return deskType;
    }

    public void setDeskType(DeskType deskType) {
        this.deskType = deskType;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Desk currentlyUnavailable(){
        setCurrentlyUsable(false);
        DeskApplicationService.deskApplicationService.closedDesk(deskId);

        return this;
    }
}
