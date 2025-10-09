package com.additionalclasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TaskList {
    private List<Task> taskList = new ArrayList<>();

    TaskList() {

    }

    public String outTaskList(){
        StringBuilder sb = new StringBuilder();
        if (taskList.isEmpty()){
            sb.append("\n----------------------\nYou have no tasks yet!\n----------------------\n\n");
            return sb.toString();
        }

        sb.append("---------- TO-DO LIST ----------\n");
        taskList.sort(Comparator.comparingInt(Task::getUniqueId));
        for(Task task : taskList){
            sb.append(task.getUniqueId() + " ");
            sb.append(task.getTitle());
            sb.append("\n");

        }
        sb.append("--------------------------------\n");


        return sb.toString();
    }
    public String outSortedPriorityList(){
        StringBuilder sb = new StringBuilder();
        if (taskList.isEmpty()){
            sb.append("\n----------------------\nYou have no tasks yet!\n----------------------\n\n");
            return sb.toString();
        }
        sb.append("---------- TO-DO LIST ----------\n");
        taskList.sort(Comparator.comparingInt(Task::getPriority).reversed());
        for(Task task : taskList){
            sb.append(task.getPriority() + " ");
            sb.append(task.getTitle());
            sb.append("\n");

        }
        sb.append("--------------------------------\n");
        return sb.toString();
    }

    public void addTask(Task task){
        taskList.add(task);
    }

    public void removeTask(Task taskToRemove){
                System.out.printf("\nTask %s was successfully removed!\n\n", taskToRemove.getTitle());
                taskList.remove(taskToRemove);



    }

    public List<Task> getTaskList() {
        return taskList;
    }


}
