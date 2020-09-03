package by.epam.learn.mirzaf4eg.MainTask;

import java.util.Scanner;

public class TaskFive {
    int FROM = 1;
    int TO = 12;
    int N;
    String[] month = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    Scanner in = new Scanner(System.in);

    boolean isInRange(int value) {
        return value >= FROM && value <= TO;
    } // Задаем условия - количество случайных чисел толжно выбираться пользователем из интервала FROM TO

    boolean isNumber(String str) {
        return str.matches("-?\\d+");
    } // Задаем условие, что введенное значение N (количество случайных чисел) должно быть целым числом

    public void getMonth() {
        System.out.println("Dear friend, enter the number of month and I will show them to you " + "(" + FROM + "-" + TO + "): ");
        while (true) {
            String line = in.nextLine();
            if (isNumber(line)) {
                N = Integer.parseInt(line);
                if (isInRange(N)) {
                    System.out.println("Ohh!");
                    return;
                }
            }
            System.out.println("Not bad, but something went wrong. Try again: ");
        }
    }
    public void ShowMouth() {
        System.out.println("You winn! This is " + month[N-1] + "!");
    }
}
