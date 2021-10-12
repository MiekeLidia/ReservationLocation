package AccountContext.EmployeeRestService;

public class EmployeeRestService {
    public static final EmployeeRestService employeeRestService = new EmployeeRestService();

    public void reservationCancelled(){
        System.out.println("Notifying Employee Reservation Got Cancelled...");
    }
}
