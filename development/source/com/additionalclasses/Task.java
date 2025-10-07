package com.additionalclasses;

public class Task {

    private int priority;
    private final String title;
    private String category;
    private int status = 0;

    Task(int priority, String title, String category){
        this.priority = priority;
        this.title = title;
        this.category = category;

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
}
