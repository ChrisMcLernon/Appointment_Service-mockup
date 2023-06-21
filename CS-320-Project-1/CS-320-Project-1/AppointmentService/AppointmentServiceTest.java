import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppointmentServiceTest {
    
    Appointment testAppointment_1 = new Appointment("111", "Lorem Ipsum", (int) System.currentTimeMillis() + 50);
    Appointment testAppointment_2 = new Appointment("222", "Lorem Ipsum", (int) System.currentTimeMillis() + 50);

    @Test
    public void addAppointmentTest(){

        AppointmentService.addAppointment(testAppointment_1);
        AppointmentService.addAppointment(testAppointment_2);
        
        assertTrue("Not Added", testAppointment_1 == AppointmentService.appointmentList.get(0));
        assertTrue("Not Added", testAppointment_2 == AppointmentService.appointmentList.get(1));

    }

    @Test
    public void deleteAppointmentTest(){
        
        AppointmentService.deleteAppointment(testAppointment_1.getID());

        assertFalse("Not Deleted", AppointmentService.appointmentList.contains(testAppointment_1));
    }

}
