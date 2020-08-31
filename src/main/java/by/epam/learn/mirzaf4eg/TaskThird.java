package by.epam.learn.mirzaf4eg;

import java.util.Random;
import java.util.Scanner;

public class TaskThird {
    int FROM = 10;
    int TO = 42;
    int N;
    Integer[] myArray;
    Random random = new Random();
    Scanner in = new Scanner(System.in);

    boolean isInRange(int value) {
        return value >= FROM && value <= TO;
    } // Задаем условия - количество случайных чисел толжно выбираться пользователем из интервала FROM TO

    boolean isNumber(String str) {
        return str.matches("-?\\d+");
    } // Задаем условие, что введенное значение N (количество случайных чисел) должно быть целым числом

    // Задаем количество случайных чисел N, проверяем N на соответствие заданным условиям isInRange(), isNumber()
    public void getN() {
        System.out.println("Dear friend, enter the number of random numbers and I will show them to you (10-42): ");
        while (true) {
            String line = in.nextLine();
            if (isNumber(line)) {
                N = Integer.parseInt(line);
                if (isInRange(N)) {
                    System.out.println("You are the best. Look what happened!");
                    return;
                }
            }
            System.out.println("Not bad, but something went wrong. Try again: ");
        }
    }
    // Формируем одномерный массив из N случайных чисел, я взял числа в пределах от 0 до 99
    public void getMyArray() {
        myArray = new Integer[N];
        for (int j = 0; j < N; ++j) {
            myArray[j] = random.nextInt(100);
        }
    }
    // Выводим содержимое полученного массива в консоль в соответствии с условиями задачи
    public void ShowMyArray() {
        System.out.println("Here are " + N + " random numbers without a newline: ");
        for (Integer j : myArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Here are " + N + " random numbers with a newline: ");
        for (Integer j : myArray) {
            System.out.println(j);
        }
    }
}
