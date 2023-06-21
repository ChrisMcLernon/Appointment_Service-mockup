import java.util.ArrayList;
import java.util.List;

public class TaskService {

    static List<Task> taskList = new ArrayList<>();

    public static void addTask(Task obj){

        if(taskList.contains(obj)){
            throw new IllegalArgumentException("Task already exists");
        }

        if(taskList == null){
            taskList.add(0, obj);
        }
        else{
            taskList.add(taskList.size(), obj);
        }

    }

    public static void deleteTask(String ID){
        
        if(taskList == null){
            throw new IllegalArgumentException("No Tasks");
        }
        else{
            for(int i = 0; i < taskList.size(); i++){
                if(taskList.get(i).getTaskID() == ID){
                    taskList.remove(i);
                }
            }
        }

    }

    public static void changeTaskElement(String elem, String ID, String x){

        int y = getTask(ID);

        if(taskList == null){
            throw new IllegalArgumentException("No Tasks");
        }
        
        if(y == -1){
            throw new IllegalArgumentException("No valid Task");
        }
        
        Task TaskWithCorrectID = taskList.get(y);

        switch (elem) {
        case "Description":
            TaskWithCorrectID.setDescription(x);
            break;

        case "Name":
            TaskWithCorrectID.setName(x);
            break;

        case "ID":
            TaskWithCorrectID.setTaskID(x);
            break;

        default:
            throw new IllegalArgumentException("Invalid Option");
        }

    }

    public static int getTask(String ID){
        for(int i = 0; i < taskList.size(); i++){
            if(taskList.get(i).getTaskID() == ID){
                return i;
            }
        }
        return -1;
    }

}
