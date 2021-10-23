package LocationContext.Application;

import LocationContext.domain.DeskType;
import LocationContext.domain.Floor;
import LocationContext.domain.Location;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.RoomRepository;

public class LocationApplicationService {
    public final DeskRepository deskRepository;
    public final RoomRepository roomRepository;
    public final DeskApplicationService deskApplicationService;

    public LocationApplicationService(DeskRepository deskRepository, RoomRepository roomRepository) {
        this.deskRepository = deskRepository;
        this.roomRepository = roomRepository;
        deskApplicationService = new DeskApplicationService(deskRepository, roomRepository);

    }
}
