package by.epam.learn;

import java.util.*;


public class AddTaskOne {
    private static final int FROM = 10;
    private static final int TO = 42;
    private static int N;
    private static boolean isInRange(int value) {
        return value >= AddTaskOne.FROM && value <= AddTaskOne.TO;
    }

    private static boolean isNumber(String str) {
        return str.matches("-?\\d+");
    }

    private static int HashArray(int x) {
        HashSet<Integer> var = new HashSet<>();
        while (x > 0) {
            var.add(x % 10);
            x /= 10;
        }
        return var.size();
    }

    static class RandomNum {
        Scanner in = new Scanner(System.in); // Объявляем объект и инициализируем
        Random random = new Random();
        private Integer[] myArray;
        double aver = 0;
        public void setN() {
            System.out.println("Dear friend, enter the number of random numbers and I will show them to you " + "(" + FROM + "-" + TO + "): ");
            while (true) {
                String line = in.nextLine();
                if (isNumber(line)) {
                    N = Integer.parseInt(line);
                    myArray = new Integer[N];
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
        public void setMyArray() {
            for (int i = 0; i < N; i++) {
                myArray[i] = random.nextInt(100000);
            }
        }
        public void showMyArray() {
            System.out.print("Here are " + N + " random numbers for you without a newline: ");
            for (int j : myArray) {
                System.out.print(j + " ");
            }
            System.out.println();
            System.out.println("Here are " + N + " random numbers with a newline: ");
            for (int j : myArray) {
                System.out.println(j);
            }
        }
        public void GetMaxMin() {
            int numMax = myArray[0];
            int numMin = myArray[0];
            for (int j : myArray) {
                if (j > numMax) {
                    numMax = j;
                }
            }
            for (int i : myArray) {
                if (i < numMin) {
                    numMin = i;
                }
            }
            System.out.println("Самое большое число, вероятно, оно и длинное: " + numMax);
            System.out.println("Самое маленькое число, вероятно, оно и короткое: " + numMin);
            System.out.println("Самое длинное число имеет длину: " + String.valueOf(numMax).length());
            System.out.println("Самое короткое число имеет длину: " + String.valueOf(numMin).length());
        }
        public void SortMyArray () {
            System.out.println("Отсортируем наши цифры по возрастанию и длине: ");
            Arrays.sort(myArray);
            for (Integer j : myArray) {
                System.out.println(j + " " + String.valueOf(j).length());
            }
            System.out.println("Отсортируем наши цифры по убыванию и длине: ");
            Arrays.sort(myArray, Collections.reverseOrder());
            for (Integer j : myArray) {
                System.out.println(j + " " + String.valueOf(j).length());
            }


        }
        public void MediumLength () {
          int[] d = new int[N];
          int l = 0;
          for (int j : myArray) {
              d[l] = String.valueOf(j).length();
              l++;
          }
          for (int i = 0; i < N; i++) {
              aver += d[i];
          }
          aver /= N;
//          System.out.println(Arrays.toString(d));
          System.out.println("Средняя длина чисел: " + aver + " (" + Math.round(aver) + ")");
      }
        public void MoLessAver() {
          System.out.println("Числа, длинна которых больше средней: ");
          for (Integer j : myArray) {
              if (aver < String.valueOf(j).length()) {
                  System.out.println(j + " " + String.valueOf(j).length());
              }
          }
          System.out.println("Числа, длинна которых меньше средней: ");
          for (Integer j : myArray) {
              if (aver > String.valueOf(j).length()) {
                  System.out.println(j + " " + String.valueOf(j).length());
              }
          }
      }
        public void DifMyArray() {
            int min = HashArray(myArray[0]);
            int minElement = myArray[0];

            for (int i = 1; i < myArray.length; i++) {
                if (HashArray(myArray[i]) < min) {
                    min = HashArray(myArray[i]);
                    minElement = myArray[i];
                }
            }
            System.out.println("Первое число, в котором количество различных цифр минимально: " + minElement);
        }
        public void ChetNecht() {
            int chetDig = 0; // Количество четных цифр в числе
            int nechetDig = 0; // Количество нечетных цифр в числе
            int chetDigOut = 0; // Количество чисел, состоящих из четных цифр
            int DigOut = 0; // Количество чисел с равным числом четных и нечетных цифр
            // Формируем динамический массив цифр
            ArrayList<Integer> myDinArray = new ArrayList<>();
            while (myArray[N] != 0) {
                myDinArray.add(myArray[N] % 10);
                myArray[N] /= 10;
            }
            // Проверяем каждую цифру на четность
            for (Integer integer : myDinArray) {
                if (integer % 2 == 0) {
                    chetDig++;
                } else { nechetDig++; }
            }
            // Если количество четных цифр в числе равно количеству цифр в числе
            if (chetDig == myDinArray.size()) {
                chetDigOut++; // Первое условие
            }
            else if (chetDig == nechetDig) {
                DigOut++; // Когда четные равны нечетным
            }
            System.out.println("Количество чисел, содержащих только четные цифры: " + chetDigOut);
            System.out.println("Количество чисел с равным числом четных и нечетных цифр: " + DigOut);
        }
    }
    public static void main(String[] args) {
        System.out.println("The main task from mirzaf4eg:");
        System.out.println("\nThe third task: Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.");
        RandomNum num = new RandomNum();
        num.setN();
        num.setMyArray();
        num.showMyArray();
        num.GetMaxMin();
        num.SortMyArray();
        num.MediumLength();
        num.MoLessAver();
        num.DifMyArray();
        num.ChetNecht();
    }
}