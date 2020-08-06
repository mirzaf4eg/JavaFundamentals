package by.epam.learn;

import java.util.*;

public class AddTaskSecond {

    private static final int FROM = 3;
    private static final int TO = 10;
    private static int N;
    private static int M;
    private static Integer[][] myArray;

    private static boolean isInRange(int value) {
        return value >= FROM && value <= TO;
    }

    private static boolean isNumber(String str) {
        return str.matches("-?\\d+");
    }

    private static int getRandom() {
        Random random = new Random();
        return random.ints(-M, (M + 1)).limit(1).findFirst().getAsInt();
    }
    public static void main(String[] args) {
        System.out.println("The second additional task from mirzaf4eg:");
        AddTaskSecond.RandomNum num = new AddTaskSecond.RandomNum();
        num.setN();
        num.SetM();
        num.setMyArray();
        num.SortMyArray();
    }
    static class RandomNum {
        Scanner in = new Scanner(System.in);
        public void setN() {
            System.out.println("Dear friend, enter the number of random numbers (3-10): ");

            while (true) {
                String line = this.in.nextLine();
                if (AddTaskSecond.isNumber(line)) {
                    AddTaskSecond.N = Integer.parseInt(line);
                    myArray = new Integer[AddTaskSecond.N][AddTaskSecond.N];
                    if (AddTaskSecond.isInRange(AddTaskSecond.N)) {
                        return;
                    }
                }
                    System.out.println("Not bad, but something went wrong. Try again: ");
            }
        }
        public void SetM() {
            System.out.println("Dear friend, enter the M (from -M to M): ");
            String line = this.in.nextLine();
            if (AddTaskSecond.isNumber(line)) {
                AddTaskSecond.M = Integer.parseInt(line);
                System.out.println("Ok! And look this: ");
            }
        }
        public void setMyArray() {
            for (int i = 0; i < myArray.length; ++i) {
                for (int j = 0; j < myArray.length; ++j) {
                    myArray[i][j] = getRandom();
                    System.out.format("%5d\t", myArray[i][j]);
                }
                System.out.println();
            }
        }
        public void SortMyArray() {
            System.out.println("Введите значение `k`: ");
            int k = this.in.nextInt();
            Arrays.sort(myArray, Comparator.comparingInt(x -> x[k]));
            for (Integer[] i : myArray) {
                for (int j : i)
                System.out.format("%5d\t", j);
                System.out.println();
            }
        }
    }
}
