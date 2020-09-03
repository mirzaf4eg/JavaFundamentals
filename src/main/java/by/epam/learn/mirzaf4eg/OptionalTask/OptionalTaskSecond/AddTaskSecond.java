package by.epam.learn.mirzaf4eg.OptionalTask.OptionalTaskSecond;
import java.util.Random;
import java.util.Scanner;

public class AddTaskSecond {
    private static int M;
    int n;
    int[][] myArray;
    Scanner in = new Scanner(System.in);

    private static boolean isInRange(int value) {
        int FROM = 3;
        int TO = 10;
        return value >= FROM && value <= TO;
    }

    private static boolean isNumber(String str) {
        return str.matches("-?\\d+");
    }

    private static int getRandom() {
        Random random = new Random();
        return random.ints(-M, (M + 1)).limit(1).findFirst().getAsInt();
    }

    public void SetN() {
        System.out.println("Dear friend, enter the number of random numbers (3-10): ");
        while (true) {
            String line = in.nextLine();
            if (isNumber(line)) {
                n = Integer.parseInt(line);
                myArray = new int[n][n];
                if (isInRange(n)) {
                    return;
                }
            }
            System.out.println("Not bad, but something went wrong. Try again: ");
        }
    }

    public void SetM() {
        System.out.println("Dear friend, enter the M (from -M to M): ");
        String line = in.nextLine();
        if (isNumber(line)) {
            M = Integer.parseInt(line);
            System.out.println("Ok! And look this: ");
        }
    }

    public void SetMyArray() {
        for (int i = 0; i < myArray.length; ++i) {
            for (int j = 0; j < myArray.length; ++j) {
                myArray[i][j] = getRandom();
            }
            System.out.println();
        }
        for (int[] i : myArray) {
            for (int j : i) {
                System.out.format("%5d\t", j);
            }
            System.out.println();
        }
    }

    public void SortMyArray() {
        System.out.println("\nEntered value `k` (1 - " + n + "): ");
        int k = in.nextInt() - 1;
        int tmp;

        System.out.println("\nArray elements in ascending order of the values of the " + (k +1) + " elements of the column: ");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i][k] > myArray[j][k]) {
                    for (int v = 0; v < myArray.length; v++) {
                        tmp = myArray[i][v];
                        myArray[i][v] = myArray[j][v];
                        myArray[j][v] = tmp;
                    }
                }
            }
        }
        for (int[] i : myArray) {
            for (int j : i) {
                System.out.format("%5d\t", j);
            }
            System.out.println();
        }
        System.out.println("\nArray elements in ascending order of the values of the " + (k +1) + " elements of the row: ");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[k][i] > myArray[k][j]) {
                    for (int v = 0; v < myArray.length; v++) {
                        tmp = myArray[v][i];
                        myArray[v][i] = myArray[v][j];
                        myArray[v][j] = tmp;
                    }
                }
            }
        }
        for (int[] i : myArray) {
            for (int j : i) {
                System.out.format("%5d\t", j);
            }
            System.out.println();
        }
    }
}