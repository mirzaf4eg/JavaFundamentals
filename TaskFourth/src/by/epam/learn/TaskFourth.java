// Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль

package by.epam.learn;
import java.util.Arrays;
import java.util.Scanner; // Импортируем сканер, для считывания вводимых данных с консоли

public class TaskFourth {

    private static final int FROM = -99;
    private static final int TO = 99;
    private static boolean isInRange(int value) {
        return value >= TaskFourth.FROM && value <= TaskFourth.TO;
    }
    private static boolean isNumber(String str) {
        return str.matches("-?\\d+");
    }

    static class IntegerNum {
        Scanner in = new Scanner(System.in); // Объявляем объект и инициализируем
        private int N;
        int myArray[] = new int[4];

        public void setMyArray() {
            System.out.println("Dear friend, enter five (5) integers " + "(" + FROM + " - " + TO + "): ");
            while (true) {
                String line = in.nextLine();
                if (isNumber(line)) {
                    for (int i = 0; i < myArray.length; i++) {
                        N = Integer.parseInt(line);
                        myArray[i] = new int[];
                    }
                    if (isInRange(N)) {
                        System.out.println("You are the best. Look what happened! " + Arrays.toString(myArray));
                        break;
                    } else {
                        System.out.println("Not bad, but something went wrong. Try again: ");
                    }
                } else {
                    System.out.println("Not bad, but something went wrong. Try again: ");
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("The main task from mirzaf4eg:");
        System.out.println("\nThe fourth task: Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.");
        IntegerNum Arr = new IntegerNum();
        Arr.setMyArray();
    }
}


