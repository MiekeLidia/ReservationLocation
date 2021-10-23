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

    public Desk(Long deskId){
        this.deskId = deskId;
    }

    public Desk(Long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Long floorId, DeskType deskType, Long roomId) {
        this.deskId = deskId;
        this.computerUsable = computerUsable;
        this.currentlyUsable = currentlyUsable;
        this.sockets = sockets;
        this.floorId = floorId;
        this.deskType = deskType;
        this.roomId = roomId;
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


    public DeskType getDeskType() {
        return deskType;
    }

    public void setDeskType(DeskType deskType) {
        this.deskType = deskType;
    }

//    public Desk currentlyUnavailable(){
//        setCurrentlyUsable(false);
//        DeskApplicationService.deskApplicationService.closedDesk(deskId);
//
//        return this;
//    }
}
