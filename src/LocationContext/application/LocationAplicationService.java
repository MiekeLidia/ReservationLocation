package LocationContext.application;

import LocationContext.domain.DeskType;
import LocationContext.domain.Floor;
import LocationContext.domain.Location;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.FloorRepository;
import LocationContext.domain.repositories.LocationRepository;
import LocationContext.domain.repositories.RoomRepository;

public class LocationAplicationService {
    public final DeskRepository deskRepository;
    public final RoomRepository roomRepository;
    public final DeskApplicationService deskApplicationService;

    public LocationAplicationService(DeskRepository deskRepository, RoomRepository roomRepository) {
        this.deskRepository = deskRepository;
        this.roomRepository = roomRepository;
        deskApplicationService = new DeskApplicationService(deskRepository, roomRepository);
    }
    public boolean addDeskToRoom(long adminId, Long roomId, long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Long locationId, Long floorId, DeskType deskType) {
        try {
            deskApplicationService.addDeskToRoom(roomId, adminId, locationId, floorId, deskId, computerUsable, sockets, deskType);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
//    public boolean addDeskToRoom(long adminId, Long roomId, long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, Floor floor, DeskType deskType) {
//
//
//        try{
//            Location location = locationRepository.getLocationById(locationId);
//            Floor floor = floorRepository.getFloorById(floorId);
//            DeskApplicationService.addDeskToRoom(adminId, roomId, deskId, computerUsable, currentlyUsable, sockets, floor, deskType);
//            return true;
//        }catch (Exeption e){
//            return false;
//        }
}
