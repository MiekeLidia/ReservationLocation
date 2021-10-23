package LocationContext.Addapter;

import LocationContext.Application.DeskApplicationService;
import LocationContext.Application.RoomApplicationService;
import LocationContext.domain.DeskType;
import LocationContext.domain.Floor;
import LocationContext.domain.Location;
import LocationContext.domain.Room;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.FloorRepository;
import LocationContext.domain.repositories.LocationRepository;
import LocationContext.domain.repositories.RoomRepository;

public class LocationRESTService {
    public RoomApplicationService roomApplicationService;


    public LocationRESTService(RoomApplicationService roomApplicationService){
        DeskRepository deskRepository = new DeskRepository();
        RoomRepository roomRepository = new
        this.roomApplicationService = new RoomApplicationService( deskRepository,  roomRepository);

    }

    public Room roomUnavailable(Long roomId){
        roomApplicationService.roomUnavailable(roomId);
        return new Room();
    }


}
