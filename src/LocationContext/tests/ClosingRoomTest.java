package LocationContext.tests;

import LocationContext.Application.DeskApplicationService;
import LocationContext.Application.RoomApplicationService;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.FloorRepository;
import LocationContext.domain.repositories.RoomRepository;
import LocationContext.infrastructure.persistence.HibernateDeskRepository;
import LocationContext.infrastructure.persistence.HibernateFloorRepository;
import LocationContext.infrastructure.persistence.HibernateRoomRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class ClosingRoomTest {
    private RoomRepository roomRepository;
    private DeskRepository deskRepository;
    private FloorRepository floorRepository;
    private RoomApplicationService roomApplicationService;
    private DeskApplicationService deskApplicationService;

    @BeforeEach
    void setUp(){
        System.out.println("Setting up system...");
        this.roomRepository = new HibernateRoomRepository();
        this.deskRepository = new HibernateDeskRepository();
        this.floorRepository = new HibernateFloorRepository();
        this.roomApplicationService = new RoomApplicationService(roomRepository, deskRepository, floorRepository);
        this.deskApplicationService = new DeskApplicationService(deskRepository, roomRepository);
        roomApplicationService.setDeskApplicationService(deskApplicationService);
        deskApplicationService.setRoomApplicationService(roomApplicationService);
    }

    @Test
    void roomClosed(){
        System.out.println("Close room");
    }

    @Test
    void desksClosed(){
        System.out.println("Close desks.");
    }

    @Test
    void usersNotified(){
        System.out.println("Notified users.");
    }


}