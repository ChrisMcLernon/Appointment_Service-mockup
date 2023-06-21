import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaskTest {
    
    Task testTask = new Task("111", "Chris", "Lorem Ipsum");

    @Test
    public void constructorTest(){
        assertEquals("111", testTask.getTaskID());
        assertEquals("Chris", testTask.getName());
        assertEquals("Lorem Ipsum", testTask.getDescription());
    
    }

}
