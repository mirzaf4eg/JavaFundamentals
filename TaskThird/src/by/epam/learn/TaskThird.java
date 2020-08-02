// Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

package by.epam.learn;
import java.util.Random;
import java.util.Scanner; // Импортируем сканер, для считывания вводимых данных с консоли

public class TaskThird {

    private static final int FROM = 10;
    private static final int TO = 42;
    private static boolean isInRange(int value) {
        return value >= TaskThird.FROM && value <= TaskThird.TO;
    }
    private static boolean isNumber(String str) {
        return str.matches("-?\\d+");
    }

    static class RandomNum {
        Scanner in = new Scanner(System.in); // Объявляем объект и инициализируем
        Random random = new Random();
        private int N;
        private int[] myArray;

        public void setN() {
            System.out.println("Dear friend, enter the number of random numbers and I will show them to you " + "(" + FROM + "-" + TO + "): ");
            while (true) {
                String line = in.nextLine();
                if (isNumber(line)) {
                    N = Integer.parseInt(line);
                    myArray = new int[N];
                    if (isInRange(N)) {
                        System.out.println("You are the best. Look what happened!");
            break;
                    } else {
                        System.out.println("Not bad, but something went wrong. Try again: ");
                    }
                } else {
                    System.out.println("Not bad, but something went wrong. Try again: ");
                }
            }
        }
        public int getN(){
            return N;
        }
        public void setMyArray(int N) {
            for (int i = 0; i < N; i++) {
                myArray[i] = random.nextInt(100);
            }
        }
            public void showMyArray () {
                System.out.print("Here are " + N + " random numbers for you without a newline: ");
                for (int j : myArray) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            public void showLnMyArray () {
                System.out.println("Here are " + N + " random numbers with a newline: ");
                for (int j : myArray) {
                    System.out.println(j);
                }
            }
        }

    public static void main(String[] args) {
        System.out.println("The main task from mirzaf4eg:");
        System.out.println("\nThe third task: Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.");
        RandomNum num = new RandomNum();
        num.setN();
        num.setMyArray(num.getN());
        num.showLnMyArray();
        num.showMyArray();
        }
    }