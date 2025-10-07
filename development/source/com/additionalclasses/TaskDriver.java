package com.additionalclasses;

import java.util.Scanner;
public class TaskDriver {

    private static TaskList taskList = new TaskList();


    TaskDriver() {

    }

    public static void startDriver() {

        while (true){
            System.out.print(MainMenu());

            Scanner input = new Scanner(System.in);
            int option = input.nextInt();

            switch (option){
                case 1:
                    break;

                case 2:
                    break;


                case 3:
                    System.out.println(taskList.outTaskList());
                    break;
            }






        }



    }

    public static String MainMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("------------------------------------\n");
        sb.append("WELCOME TO THE TO-DO LIST BY TUIOP1");
        sb.append("\n");
        sb.append("\n");
        sb.append("\n");
        sb.append("Choose the option!");
        sb.append("\n");
        sb.append("1 - Add the task");
        sb.append("\n");
        sb.append("2 - Remove the task");
        sb.append("\n");
        sb.append("3 - list all tasks");
        sb.append("\n");
        sb.append(":");

        return sb.toString();


    }


}
