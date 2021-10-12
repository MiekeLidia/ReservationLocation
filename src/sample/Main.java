package sample;

import LocationContext.Addapter.LocationRESTService;
import SelfReservationContext.Adapter.RestService;
import SelfReservationContext.Application.ReservationApplicationService;
import SelfReservationContext.Data.ReservationRepository;

public class Main {

    public static void main(String[] args) {
        roomPutUnavailable(10L);
    }

    public static void roomPutUnavailable(Long roomId){
        LocationRESTService locationRESTService = new LocationRESTService();
        locationRESTService.roomUnavailable(roomId);
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
