package LocationContext.test;
import LocationContext.Application.LocationApplicationService;
import LocationContext.domain.DeskType;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.RoomRepository;
import LocationContext.infrastructure.persistence.HibernateDeskRepository;
import LocationContext.infrastructure.persistence.HibernateRoomRepository;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class AddDeskToRoomTest{
    private static RoomRepository roomRepository;
    private static DeskRepository deskRepository;
    private static LocationApplicationService locationApplicationService;

//    @BeforeEach
//    private void setup(){
//        roomRepository = new HibernateRoomRepository();
//        deskRepository = new HibernateDeskRepository();
//        locationApplicationService = new LocationApplicationService(deskRepository, roomRepository);
//
//
//    }
    @Test
    public void addDesk(){
        roomRepository = new HibernateRoomRepository();
        deskRepository = new HibernateDeskRepository();
        locationApplicationService = new LocationApplicationService(deskRepository, roomRepository);

        Long roomId = 1L;
        Long adminId = 1L;
        Long locationId = 1L;
        Long floorId = 1L;
        Long deskId = 100L;
        boolean computerUsable = true;
        boolean currentlyUsable = true;
        boolean sockets = false;
        DeskType deskType = DeskType.STANDAARD_DESK;


        //alles werkt

        boolean test1 = locationApplicationService.addDeskToRoom(adminId, roomId, deskId, computerUsable, currentlyUsable, sockets, locationId, floorId, deskType);
        assertTrue(test1);

        //desk already exists
        boolean test2 = locationApplicationService.addDeskToRoom(adminId, roomId, deskId, computerUsable, currentlyUsable, sockets, locationId, floorId, deskType);
        assertFalse(test2);

        //room does not exists
        Long roomId2 = 44L;
        boolean test3 = locationApplicationService.addDeskToRoom(adminId, roomId2, deskId, computerUsable, currentlyUsable, sockets, locationId, floorId, deskType);
        assertFalse(test3);

        //location does not exists
        Long locationId2 = 234L;
        boolean test4 = locationApplicationService.addDeskToRoom(adminId, roomId, deskId, computerUsable, currentlyUsable, sockets, locationId2, floorId, deskType);
        assertFalse(test4);

    }
}
