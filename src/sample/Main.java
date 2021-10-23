package sample;

import LocationContext.adapter.RoomRESTService;
import LocationContext.application.DeskApplicationService;
import LocationContext.application.RoomApplicationService;
import LocationContext.domain.repositories.DeskRepository;
import LocationContext.domain.repositories.FloorRepository;
import LocationContext.domain.repositories.RoomRepository;
import LocationContext.infrastructure.persistence.HibernateDeskRepository;
import LocationContext.infrastructure.persistence.HibernateRoomRepository;

public class Main {
    private static RoomRepository roomRepository;
    private static DeskRepository deskRepository;
    private static FloorRepository floorRepository;
    private static RoomApplicationService roomApplicationService;
    private static DeskApplicationService deskApplicationService;

    public static void main(String[] args) {
        setup();
        roomPutUnavailable(10L);
    }

    private static void setup(){
        roomRepository = new HibernateRoomRepository();
        deskRepository = new HibernateDeskRepository();
        roomApplicationService = new RoomApplicationService(deskRepository, roomRepository, floorRepository);
        deskApplicationService = new DeskApplicationService();
    }

    public static void roomPutUnavailable(Long roomId){
        RoomRESTService roomService = new RoomRESTService(roomApplicationService);
        roomService.roomUnavailable(roomId);
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