package com.additionalclasses;

public class Task {

    private int priority;
    private final String title;
    private String category;
    private int status = 0;
    private static int Id = 1;
    private int uniqueId;

    Task(int priority, String title, String category){
        this.uniqueId = Id;
        this.priority = priority;
        this.title = title;
        this.category = category;
        Id++;
    }

    public int getPriority() {
        return priority;
    }

    public int getStatus() {
        return status;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUniqueId(){
        return uniqueId;
    }


    public String printDescription(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nTitle: " + this.getTitle());
        sb.append("\nStatus: ");
        sb.append((this.getStatus() == 0) ? "Uncompleted" : "Completed");
        sb.append("\nCategory: " + this.getCategory());
        sb.append("\nPriority: " + this.getPriority());
        sb.append("\n");
        return sb.toString();

    }
}
