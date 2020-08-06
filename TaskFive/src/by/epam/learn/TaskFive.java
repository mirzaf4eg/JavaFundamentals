package by.epam.learn;

import java.util.Scanner;

public class TaskFive {
    private static final int FROM = 1;
    private static final int TO = 12;
    private static boolean isInRange(int value) {
        return value >= TaskFive.FROM && value <= TaskFive.TO;
    }
    private static boolean isNumber(String str) {
        return str.matches("-?\\d+");
    }
    static class Month {
        Scanner in = new Scanner(System.in); // Объявляем объект и инициализируем
        private int N;
        private final String[] month = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        private void ControlN() {
            System.out.println("Dear friend, enter the number of month and I will show them to you " + "(" + FROM + "-" + TO + "): ");
            while (true) {
                String line = in.nextLine();
                if (isNumber(line)) {
                    N = Integer.parseInt(line);
                    if (isInRange(N)) {
                        System.out.println("Ohh!");
                        break;
                    } else {
                        System.out.println("Not bad, but something went wrong. Try again: ");
                    }
                } else {
                    System.out.println("Not bad, but something went wrong. Try again: ");
                }
            }
        }
        public void ShowMouth() {
            System.out.println("You winn! This is " + month[N-1] + "!");
        }
    }
    public static void main(String[] args) {
        Month num = new Month();
        num.ControlN();
        num.ShowMouth();
    }
}
