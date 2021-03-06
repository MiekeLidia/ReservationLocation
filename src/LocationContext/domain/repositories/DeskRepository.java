package LocationContext.domain.repositories;

import LocationContext.domain.Desk;
import LocationContext.domain.Room;

public interface DeskRepository {

    public Desk findDeskById(Long id);

    public boolean save(Desk desk);

    public Desk findById(Long id);
}
