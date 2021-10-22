package LocationContext.domain.repositories;

import LocationContext.domain.Desk;

public interface DeskRepository {

    public boolean save(Desk desk);

    public Desk findById(Long id);
}
