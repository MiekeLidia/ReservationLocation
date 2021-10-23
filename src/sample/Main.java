package sample;

import LocationContext.Addapter.RoomRESTService;
import LocationContext.Application.DeskApplicationService;
import LocationContext.Application.LocationApplicationService;
import LocationContext.Application.RoomApplicationService;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.RoomRepository;
import LocationContext.infrastructure.persistence.HibernateDeskRepository;
import LocationContext.infrastructure.persistence.HibernateFloorRepository;
import LocationContext.infrastructure.persistence.HibernateRoomRepository;
import LocationContext.domain.DeskType;
import LocationContext.domain.repositories.FloorRepository;

public class Main {
    private static RoomRepository roomRepository;
    private static DeskRepository deskRepository;
    private static FloorRepository floorRepository;
    private static RoomApplicationService roomApplicationService;
    private static DeskApplicationService deskApplicationService;
    private static LocationApplicationService locationApplicationService;

    public static void main(String[] args) {
        setup();

        roomPutUnavailable(10L);
        addDeskToRoom();
    }

    private static void setup(){
        roomRepository = new HibernateRoomRepository();
        deskRepository = new HibernateDeskRepository();
        floorRepository = new HibernateFloorRepository();

        roomApplicationService = new RoomApplicationService(roomRepository, deskRepository, floorRepository);
        deskApplicationService = new DeskApplicationService(deskRepository, roomRepository);
        locationApplicationService = new LocationApplicationService(deskRepository, roomRepository);

        roomApplicationService.setDeskApplicationService(deskApplicationService);
        deskApplicationService.setRoomApplicationService(roomApplicationService);
    }

    public static void roomPutUnavailable(Long roomId) {
        RoomRESTService roomService = new RoomRESTService(roomApplicationService);
        roomService.roomUnavailable(roomId);
    }

    public static void addDeskToRoom() {
        Long roomId = 1L;
        Long adminId = 1L;
        Long locationId = 1L;
        Long floorId = 1L;
        Long deskId = 100L;
        boolean computerUsable = true;
        boolean currentlyUsable = true;
        boolean sockets = false;
        DeskType deskType = DeskType.STANDAARD_DESK;

        locationApplicationService.addDeskToRoom(adminId, roomId, deskId, computerUsable, currentlyUsable, sockets, locationId, floorId, deskType);
    }
}
