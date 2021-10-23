package LocationContext.domain.repositories;

import LocationContext.domain.Floor;

public interface FloorRepository {

    public boolean save(Floor floor);

    public Floor getFloorById(Long floor);
}
