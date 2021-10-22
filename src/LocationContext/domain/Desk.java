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
    public void setCurrentlyUsable(boolean currentlyUsable) {
        this.currentlyUsable = currentlyUsable;
    }

    public Desk currentlyUnavailable(){
        setCurrentlyUsable(false);

        // Inject Adapter pattern
        DeskApplicationService.deskApplicationService.closedDesk(deskId);

        return this;
    }
}
