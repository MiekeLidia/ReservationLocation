package LocationContext.domain.repositories;
import LocationContext.domain.Location;

public interface LocationRepository {
    
    public boolean save(Location location);

    public Location getLocationById(Long locationId);
}
