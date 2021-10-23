package LocationContext.Application;

import LocationContext.domain.DeskType;
import LocationContext.domain.Floor;
import LocationContext.domain.Location;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.RoomRepository;

public class LocationAplicationService {
    public final DeskApplicationService deskApplicationService = new DeskApplicationService();
    public final DeskRepository deskRepository;
    public final RoomRepository roomRepository;


    public LocationAplicationService(DeskRepository deskRepository, RoomRepository roomRepository) {
        this.deskRepository = deskRepository;
        this.roomRepository = roomRepository;
    }

    public boolean addDeskToRoom(long adminId, Long roomId, long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Floor floor, DeskType deskType) {


        try{
            Location location = locationRepository.getLocationById(locationId);
            Floor floor = floorRepository.getFloorById(floorId);
            DeskApplicationService.addDeskToRoom(adminId, roomId, deskId, computerUsable, currentlyUsable, sockets, floor, deskType);
            return true;
        }catch (Exeption e){
            return false;
        }
}
