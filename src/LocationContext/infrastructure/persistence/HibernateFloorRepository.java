package LocationContext.infrastructure.persistence;

import LocationContext.domain.Floor;
import LocationContext.domain.repositories.FloorRepository;

public class HibernateFloorRepository implements FloorRepository {

    public boolean save(Floor floor){
        return true;
    }

    public Floor getFloorById(Long floor){
        return new Floor();
    }

}
