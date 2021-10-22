package LocationContext.domain.repositories;

import LocationContext.domain.Desk;
import LocationContext.domain.Room;

import java.util.ArrayList;

public class DeskRepository {

    public boolean deskExists(long deskId) {
        if (this.getDeskById(deskId) == null){
            return false;
        }
        return true;

    }

    public Desk getDeskById(Long deskId){
       return findById(deskId);
    }

    public boolean save(Desk desk){
        System.out.println("Saving Desk...");
        return true;
    }
}
