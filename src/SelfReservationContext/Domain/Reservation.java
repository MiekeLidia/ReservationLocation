package SelfReservationContext.Domain;

import java.sql.Time;
import java.util.Date;

public class Reservation {
    public Long id;
    public Long employeeId;
    public Long deskId;

    public String reason;
    public Date date;
    public Time startTime;
    public int amountTime;
    public String currentStatus;

    public Reservation () {}

    public Reservation (Long id, Long employeeId, Long deskId, String reason, Date date, Time startTime, int amountTime, String currentStatus){
        this.id = id;
        this.employeeId = employeeId;
        this.deskId = deskId;
        this.reason = reason;
        this.date = date;
        this.startTime = startTime;
        this.amountTime = amountTime;
        this.currentStatus = currentStatus;
    }

    public void cancelReservation(){
        this.currentStatus = "Cancelled";
    }
}
