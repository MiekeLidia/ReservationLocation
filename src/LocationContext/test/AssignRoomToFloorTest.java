package LocationContext.test;

import LocationContext.Application.DeskApplicationService;
import LocationContext.Application.RoomApplicationService;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.FloorRepository;
import LocationContext.domain.repositories.RoomRepository;
import LocationContext.infrastructure.persistence.HibernateFloorRepository;
import LocationContext.infrastructure.persistence.HibernateRoomRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class AssignRoomToFloorTest {
    private RoomRepository roomRepository;
    private FloorRepository floorRepository;
    private DeskRepository deskRepository;
    private RoomApplicationService roomApplicationService;

    @BeforeEach
    void setUp(){
        System.out.println("Setting up system...");
        this.roomRepository = new HibernateRoomRepository();
        this.floorRepository = new HibernateFloorRepository();
        this.roomApplicationService = new RoomApplicationService(roomRepository, deskRepository, floorRepository);
    }

    @Test
    void assignRoom(){
        System.out.println("Room assigned");
    }
}
