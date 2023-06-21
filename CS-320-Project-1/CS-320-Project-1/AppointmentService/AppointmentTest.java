import static org.junit.Assert.assertEquals;
import java.util.Date;
import org.junit.Test;

public class AppointmentTest {
    
    Appointment testAppointment = new Appointment("111", "Lorem Ipsum", (int) System.currentTimeMillis() + 50);
    Date testDate = new Date((int) System.currentTimeMillis() + 50);

    @Test
    public void constructorTest(){
        assertEquals(111, Integer.parseInt(testAppointment.getID()));
        assertEquals("Lorem Ipsum", testAppointment.getDesc());
        assertEquals(testDate, testAppointment.getAppointmentDate());
    
    }

}
