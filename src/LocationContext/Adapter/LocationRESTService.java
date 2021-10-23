package LocationContext.Adapter;

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
        this.roomApplicationService = roomApplicationService;

    }

    public Room roomUnavailable(Long roomId){
        roomApplicationService.roomUnavailable(roomId);
        return new Room();
    }


}
