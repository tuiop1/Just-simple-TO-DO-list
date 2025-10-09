package com.additionalclasses;


import java.util.Scanner;

public class TaskDriver {

    private final static TaskList taskList = new TaskList();


    TaskDriver() {

    }

    public static void startDriver() {

        System.out.println("-----------------------------------");
        System.out.println("WELCOME TO THE TO-DO LIST BY TUIOP1");
        System.out.println("-----------------------------------");


        while (true) {
            MainMenu();

            Scanner input = new Scanner(System.in);
            String option = input.nextLine();

            if (option.equals("1")) {
                ChoiceMenu();
            }
            if (option.equals("2")) {
                removalMenu();

            }
            if (option.equals("3")) {

                System.out.println(taskList.outTaskList());
                System.out.println("Enter to continue...");
                String justWait = input.nextLine();

            }
            if (option.equals("3p")) {

                System.out.println(taskList.outSortedPriorityList());
                System.out.println("Enter to continue...");
                String justWait = input.nextLine();

            }
            if (option.equals("exit")) {
                break;

            }
            for (Task task : taskList.getTaskList()) {
                if (task.getTitle().equals(option)){
                    System.out.println(task.printDescription());
                    System.out.println("Enter to continue...");
                    String justWait = input.nextLine();



                }
            }


        }


    }

    public static void MainMenu() {

        System.out.println("Choose the option!");

        System.out.println("1 - Add the task");

        System.out.println("2 - Remove the task");

        System.out.println("3 - list all tasks");

        System.out.println("title of the task - show description");

        System.out.print(":");


    }

    public static void ChoiceMenu() {

        System.out.println("\n------------------------------------");

        System.out.print("Enter the title of the task");


        System.out.println(":");
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();


        System.out.println("Enter the priority of the task (Enter to skip)");


        System.out.print("(1-3):");
        String priority = input.nextLine();
        if (priority.isEmpty()) {
            priority = "2";
        }

        System.out.println("Enter the category of the task (Enter to skip)");


        System.out.print(":");
        String category = input.nextLine();
        if (category.isEmpty()) {
            category = "Undefined";
        }
        taskList.addTask(new Task(Integer.parseInt(priority), title, category));


    }

    public static void removalMenu() {
        taskList.outTaskList();
        System.out.println();
        System.out.println();
        System.out.println("Choose the title of the book you want to remove");
        System.out.print(":");
        Scanner input = new Scanner(System.in);
        String taskToRemove = input.nextLine();


        for (int i = 0; i < taskList.getTaskList().size(); i++) {

            if (taskList.getTaskList().get(i).getTitle().equals(taskToRemove)) {
                taskList.removeTask(taskList.getTaskList().get(i));
            }
        }


    }
}
