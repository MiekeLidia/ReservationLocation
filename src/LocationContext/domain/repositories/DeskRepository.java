package LocationContext.domain.repositories;

import LocationContext.domain.Desk;

public class DeskRepository {

    public boolean save(Desk desk){
        System.out.println("Saving Desk...");
        return true;
    }
}
