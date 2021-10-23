package LocationContext.domain.repositories;

import LocationContext.domain.Desk;
import LocationContext.domain.Room;

import java.util.ArrayList;

public interface DeskRepository {

    public Desk getDeskById(Long deskId);

    public boolean save(Desk desk);
}
