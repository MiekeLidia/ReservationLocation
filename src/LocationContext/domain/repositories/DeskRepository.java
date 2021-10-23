package LocationContext.domain.repositories;

import LocationContext.domain.Desk;
import LocationContext.domain.Room;

import java.util.ArrayList;

public interface DeskRepository {

    public Desk findDeskById(Long id);

    public boolean save(Desk desk);
}
