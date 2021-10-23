package LocationContext.domain.repositories;

import LocationContext.domain.Desk;
import LocationContext.domain.Room;

import java.util.ArrayList;

public interface DeskRepository {

    public static boolean deskExists(long deskId) {
        if (getDeskById(deskId) == null){
            return false;
        }
        return true;
    }

    public static Desk getDeskById(Long deskId){
       return findById(deskId);
    }

    public boolean save(Desk desk){
        System.out.println("Saving Desk...");
        return true;
    }
}
