package by.epam.learn.mirzaf4eg;
import java.util.HashSet;
import java.util.Scanner;

public class AddTaskFirst {
    int[] num;
    int[] len;
    int n;

    public static int getLength (int l) {
        l = (int) (Math.log10(Math.abs(l)));
        return l;
    }

    private static int HashNum (int x) {
        HashSet<Integer> h;
        for (h = new HashSet<>(); x > 0; x /= 10) {
            h.add(x % 10);
        }
        return h.size();
    }


    // Запрашиваю у пользователя количество чисел (n), которые он будет вводить с консоли
    public void SetNum() {

        Scanner in = new Scanner(System.in);
        System.out.println("Dear friend, enter `n` (array length): ");
        n = in.nextInt();
        num = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dear friend, enter " + (i + 1) + " integers: ");
            num[i] = in.nextInt();
        }
        System.out.println();
    }

    // Сразу нахожу длину введенных чисел и записываю ее в отдельный массив
    public void GetLong() {
        len = new int[n];
        // Для вычисления длины чисел использую логарифмический подход
        for (int i = 0; i < len.length; i++) {
            len[i] = getLength(num[i]) + 1;
        }
        // На всякий случай выведу в консоль введенные числа и их длину
        for (int j = 0; j < len.length; j++) {
            System.out.println("The your number: " + num[j] + ", its length: " + len[j]);
        }
        System.out.println();
    }

    // Нахожу числа имеющие самую большую и самую маленькую длину
    public void MinMaxLong() {

        // Объявление и инициализация переменных
        int maxNumLong = 0;
        int minNumLong = 0;
        int maxLong = 0;
        int minLong = String.valueOf(num[0]).length();

        for (int i = 0; i < num.length; i++) {
            if (len[i] > maxLong) {
                maxLong = len[i];
                maxNumLong = num[i];
            } else {
                if (len[i] < minLong) {
                    minLong = len[i];
                    minNumLong = num[i];
                }
            }
        }
        System.out.println("The long number: " + maxNumLong + ", its length: " + maxLong);
        System.out.println("The shortest number: " + minNumLong + ", its length: " + minLong);
    }

    // Сортирую числа (строки) по убыванию (возрастанию) значений их длинны
    public void SortNum() {

        // Использую алгоритм пузырчатой сортировки (Bubble sort) отдельно по возрастанию и убыванию
        for (int j = num.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if ((getLength(num[i]) + 1) > (getLength(num[i+1]) + 1)) {
                    int tmp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = tmp;
                }
            }
        }
        System.out.println("\nYour numbers in ascending order of their length: ");
        for (int j : num) {
            System.out.println(j + " ");
        }
        for (int j = num.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if ((getLength(num[i]) + 1) < (getLength(num[i+1]) + 1)) {
                    int tmp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = tmp;
                }
            }
        }
        System.out.println("\nYour numbers are in descending order of their length: ");
        for (int j : num) {
            System.out.println(j + " ");
        }
    }

    // Нахожу среднюю длину чисел, и вывожу в консоль числа, длинна которых меньше (больше) средней и их значения
    public void MoLessAver() {

        // Нахожу среднюю длину чисел (строк) (из массима длин чисел)
        double aver = 0.0D;

        for (int j : len) {
            aver += j;
        }
        aver /= n;
        System.out.println("\nAverage length of numbers: " + aver);

        // Нахожу те числа, длина которых меньше средней длины по всем числам, вывожу их значение и их длину в консоль
        System.out.println("\nNumbers whose length is less than the average: ");
        for (int j : num) {
            if ((getLength(j) + 1) < aver) {
                System.out.println(j + "\t" + "His length: " + (getLength(j) + 1));
            }
        }
        // Нахожу те числа, длина которых больше средней длины по всем числам, вывожу их значение и их длину в консоль
        System.out.println("\nNumbers that are longer than the average length: ");
        for (int j : num) {
            if ((getLength(j) + 1) > aver) {
                System.out.println(j + "\t" + "His length: " + (getLength(j) + 1));
            }
        }
    }

    // Используя хэш-функцию нахожу первое число в котором количество различных цифр минимально
    public void DifNum () {

        int min = HashNum(num[0]);
        int minEl = num[0];

        for (int j : num) {
            if (HashNum(j) < min) {
                min = HashNum(j);
                minEl = j;
            }
        }
        System.out.println("\nThe first number in which the number of different digits is minimal: " + minEl);
    }
}