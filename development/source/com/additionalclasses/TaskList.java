package com.additionalclasses;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> taskList = new ArrayList<>();

    TaskList() {

    }

    public String outTaskList(){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(Task task : taskList){
            sb.append(i + " ");
            sb.append(task.getTitle());
            sb.append("\n");
            i++;
        }

        System.out.println("testing");
        return sb.toString();
    }
    public void addTask(Task task){
        taskList.add(task);
    }

    public void removeTask(String taskToRemove){
        for (Task task : taskList){
            if(task.getTitle().equals(taskToRemove)){
                taskList.remove(task);
                System.out.printf("Task %s was successfully removed!", taskToRemove);
            }
        }
    }


}
