package LocationContext.domain;

import LocationContext.application.DeskApplicationService;

public class Desk {
    private Long deskId;
    private boolean computerUsable;
    private boolean currentlyUsable;
    private boolean sockets;
    private Long floorId;
    private DeskType deskType;
    private Long roomId;
    protected Long locationId;
    private DeskApplicationService deskApplicationService;

    public Desk(Long deskId){
        this.deskId = deskId;
    }

    public Desk(Long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Long floorId, DeskType deskType, Long roomId, Long locationId) {
        this.deskId = deskId;
        this.computerUsable = computerUsable;
        this.currentlyUsable = currentlyUsable;
        this.sockets = sockets;
        this.floorId = floorId;
        this.deskType = deskType;
        this.roomId = roomId;
        this.locationId = locationId;
    }
    public void setCurrentlyUsable(boolean currentlyUsable) {
        this.currentlyUsable = currentlyUsable;
    }

    public Desk currentlyUnavailable(DeskApplicationService deskApplicationService){
        setCurrentlyUsable(false);

        // Inject Adapter pattern
        deskApplicationService.closedDesk(deskId);

        return this;
    }
}
