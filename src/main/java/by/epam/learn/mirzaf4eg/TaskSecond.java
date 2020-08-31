package by.epam.learn.mirzaf4eg;


import java.util.Scanner;

public class TaskSecond {
    String arg;
    Scanner in = new Scanner(System.in);
    StringBuilder reverse;
    public TaskSecond() {
        arg = in.nextLine();
        reverse = new StringBuilder(arg).reverse();
    }
}