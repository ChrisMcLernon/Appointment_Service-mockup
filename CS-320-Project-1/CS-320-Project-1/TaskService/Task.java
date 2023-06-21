public class Task {

    String taskID;
    String name;
    String description;

    public Task(String ID, String name, String description){

        if(ID == null || ID.length() > 10){
            throw new IllegalArgumentException("Invalid ID");
        }

        if(name == null || name.length() > 20){
            throw new IllegalArgumentException("Invalid Name");
        }

        if(description == null || description.length() > 50){
            throw new IllegalArgumentException("Invalid Description");
        }

        taskID = ID;
        this.name = name;
        this.description = description;

    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public String getTaskID() {
        return taskID;
    }
    public void setDescription(String description) {
        if(description == null || description.length() > 50){
            throw new IllegalArgumentException("Invalid Description");
        }
        this.description = description;
    }
    public void setName(String name) {
        if(name == null || name.length() > 20){
            throw new IllegalArgumentException("Invalid Name");
        }
        this.name = name;
    }
    public void setTaskID(String taskID) {
        if(taskID == null || taskID.length() > 10){
            throw new IllegalArgumentException("Invalid ID");
        }
        this.taskID = taskID;
    }
    
}
