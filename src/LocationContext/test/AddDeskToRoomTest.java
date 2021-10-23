package LocationContext.test;
import LocationContext.Application.DeskApplicationService;
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
    private static DeskApplicationService deskApplicationService;

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
        deskApplicationService = new DeskApplicationService(deskRepository, roomRepository);

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

        boolean test1 = deskApplicationService.addDeskToRoom(adminId, roomId, deskId, computerUsable, sockets, locationId, floorId, deskType);
        assertTrue(test1);

        //desk already exists
        boolean test2 = deskApplicationService.addDeskToRoom(adminId, roomId, deskId, computerUsable, sockets, locationId, floorId, deskType);
        assertFalse(test2);

        //room does not exists
        Long roomId2 = 44L;
        boolean test3 = deskApplicationService.addDeskToRoom(adminId, roomId2, deskId, computerUsable, sockets, locationId, floorId, deskType);
        assertFalse(test3);

        //location does not exists
        Long locationId2 = 234L;
        boolean test4 = deskApplicationService.addDeskToRoom(adminId, roomId, deskId, computerUsable, sockets, locationId2, floorId, deskType);
        assertFalse(test4);

    }
}
