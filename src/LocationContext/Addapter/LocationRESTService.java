package LocationContext.Addapter;

import LocationContext.Application.DeskApplicationService;
import LocationContext.Application.RoomApplicationService;
import LocationContext.domain.DeskType;
import LocationContext.domain.Floor;
import LocationContext.domain.Location;
import LocationContext.domain.Room;
import LocationContext.domain.repositories.FloorRepository;
import LocationContext.domain.repositories.LocationRepository;

public class LocationRESTService {
    public RoomApplicationService roomApplicationService;
    public final LocationRepository locationRepository;
    public final FloorRepository floorRepository;

    public LocationRESTService(LocationRepository locationRepository, FloorRepository floorRepository){
        this.roomApplicationService = new RoomApplicationService();
        this.locationRepository = locationRepository;
        this.floorRepository = floorRepository;
    }

    public Room roomUnavailable(Long roomId){
        roomApplicationService.roomUnavailable(roomId);
        return new Room();
    }

    public boolean addDeskToRoom(long roomId, long adminId, long locationId, long floorId, long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, DeskType deskType){
        try{
            Location location = locationRepository.getLocationById(locationId);
            Floor floor = floorRepository.getFloorById(floorId);
            DeskApplicationService.addDeskToRoom(adminId, roomId, deskId, computerUsable, currentlyUsable, sockets, floor, deskType);
            return true;
        }catch (Exeption e){
            return false;
        }

    }


}
