package sample;

//import LocationContext.Adapter.LocationRESTService;

import LocationContext.Adapter.RoomRESTService;
import LocationContext.Application.RoomApplicationService;
import LocationContext.domain.DeskType;

public class Main {

    public static void main(String[] args) {
//        roomPutUnavailable(10L);
        Long roomId = 1L;
        Long adminId = 1L;
        Long locationId = 1L;
        Long floorId = 1L;
        Long deskId = 100L;
        boolean computerUsable = true;
        boolean currentlyUsable = true;
        boolean sockets = false;
        DeskType deskType = DeskType.STANDAARD_DESK;




        addDeskToRoom(roomId, adminId, locationId, floorId, deskId, computerUsable, currentlyUsable, sockets, deskType);

    }

//    public static void roomPutUnavailable(Long roomId){
//        LocationRESTService locationRESTService = new LocationRESTService();
//        locationRESTService.roomUnavailable(roomId);
//    }

    public static void addDeskToRoom(Long roomId, Long adminId, Long locationId, Long floorId, Long deskId, boolean computerUsable, boolean currentlyUsable, boolean sockets, DeskType deskType){

        RoomRESTService roomRESTService = new RoomRESTService(new RoomApplicationService());
        roomRESTService.addDeskToRoom(roomId, adminId, locationId, floorId, deskId, computerUsable, currentlyUsable, sockets, deskType);


    }
}

/* import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
} */
