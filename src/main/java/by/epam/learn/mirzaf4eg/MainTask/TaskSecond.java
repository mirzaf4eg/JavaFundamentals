package by.epam.learn.mirzaf4eg.MainTask;

import java.util.Scanner;

public class TaskSecond {

    Scanner in = new Scanner(System.in);
    String argumentCommandLine;

    public TaskSecond() {
        argumentCommandLine = in.nextLine();
        if (argumentCommandLine.length() <= 1) {
            argumentCommandLine = argumentCommandLine.substring(1) + argumentCommandLine.charAt(0);
        }
    }
}