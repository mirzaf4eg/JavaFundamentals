package by.epam.learn.mirzaf4eg;

import java.util.Scanner;

public class TaskFourth {
    int sum = 0;
    int mul = 1;
    int N;
    Scanner in = new Scanner(System.in);

    public void getNum() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Dear friend, enter " + i + " integers: ");
            if (in.hasNextInt()) {
                N = in.nextInt();
                sum = sum + N;
                mul *= N;
            } else {
                System.out.println("Not bad, but something went wrong. Try again: ");
                return;
            }
        }
        System.out.println("The sum of the entered numbers: " + sum);
        System.out.println("The multiplication of entered numbers: " + mul);
    }
}






