import java.util.*;

public class Appointment {
    
    String ID;
    String desc;
    Date appointmentDate = new Date();
    Date currDate = new Date(System.currentTimeMillis());

    public Appointment(String ID, String desc, int dateINT){

        if(ID == null || ID.length() > 10){
            throw new IllegalArgumentException("Invalid ID");
        }

        if(desc == null || desc.length() > 50){
            throw new IllegalArgumentException("Invalid Name");
        }

        Date date = new Date(dateINT);

        if(date == null || currDate.before(date)){
            throw new IllegalArgumentException("Invalid Date");
        }

        this.ID = ID;
        this.desc = desc;
        appointmentDate = date;

    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public String getDesc() {
        return desc;
    }

    public String getID() {
        return ID;
    }

    public void setAppointmentDate(Date date) {
        if(date == null || date.before(currDate)){
            throw new IllegalArgumentException("Invalid Date");
        }
        
        this.appointmentDate = date;
    }

    public void setDesc(String desc) {
        if(desc == null || desc.length() > 50){
            throw new IllegalArgumentException("Invalid Name");
        }

        this.desc = desc;
    }

    public void setID(String iD) {
        if(ID == null || ID.length() > 10){
            throw new IllegalArgumentException("Invalid ID");
        }

        ID = iD;
    }



}