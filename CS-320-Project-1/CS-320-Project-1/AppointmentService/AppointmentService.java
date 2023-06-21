import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
    
    static List<Appointment> appointmentList = new ArrayList<>();

    public static void addAppointment(Appointment obj){

        if(appointmentList.contains(obj)){
            throw new IllegalArgumentException("Appointment already exists");
        }

        if(appointmentList == null){
            appointmentList.add(0, obj);
        }
        else{
            appointmentList.add(appointmentList.size(), obj);
        }

    }

    public static void deleteAppointment(String ID){
        
        if(appointmentList == null){
            throw new IllegalArgumentException("No appointments");
        }
        else{
            for(int i = 0; i < appointmentList.size(); i++){
                if(appointmentList.get(i).ID == ID){
                    appointmentList.remove(i);
                }
            }
        }

    }
}
