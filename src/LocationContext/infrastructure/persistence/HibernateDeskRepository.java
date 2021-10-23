package LocationContext.infrastructure.persistence;

import LocationContext.domain.Desk;
import LocationContext.domain.repositories.DeskRepository;

public class HibernateDeskRepository implements DeskRepository {

    @Override
    public boolean save(Desk desk) {
        System.out.println("Saving desk...");
        return true;
    }

    @Override
    public Desk findById(Long id) {
        System.out.println("Getting desk: " + id + "...");
        return new Desk(id);
    }

    public Desk findDeskById(Long id) {
        System.out.println("Getting desk: " + id + "...");
        return new Desk(id);
    }
}
