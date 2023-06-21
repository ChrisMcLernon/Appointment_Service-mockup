import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TaskServiceTest {
    
    Task testTask_1 = new Task("111", "Chris", "Lorem Ipsum");
    Task testTask_2 = new Task("222", "Chris","Lorem Ipsum");

    @Test
    public void addTaskTest(){

        TaskService.addTask(testTask_1);
        TaskService.addTask(testTask_2);

        assertTrue("Not Added", testTask_1 == TaskService.taskList.get(0));
        assertTrue("Not Added", testTask_2 == TaskService.taskList.get(1));
    }

    @Test
    public void deleteTaskTest(){

        TaskService.deleteTask(testTask_2.getTaskID());

        assertFalse("Not Deleted", TaskService.taskList.contains(testTask_2));

    }

    @Test
    public void changeTaskElementTest(){

        TaskService.changeTaskElement("Description", "111", "Test");
        TaskService.changeTaskElement("Name", "111", "James");

        assertTrue("Not Changed", TaskService.taskList.get(TaskService.getTask("111")).getDescription() == "Test");
        assertTrue("Not Changed", TaskService.taskList.get(TaskService.getTask("111")).getName() == "James");
    }
}
