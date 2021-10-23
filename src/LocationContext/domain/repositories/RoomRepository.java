package LocationContext.domain.repositories;

import LocationContext.domain.Desk;
import LocationContext.domain.Room;

import java.util.ArrayList;

public interface RoomRepository {

//
//    public static boolean roomExists(long roomId) {
//        if (findRoomById(roomId) == null){
//            return false;
//        }
//        return true;
//
//    }


    public boolean save(Room room);

    public Room getRoomById(Long roomId);
    }
