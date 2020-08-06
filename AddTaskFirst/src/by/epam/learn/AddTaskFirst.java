package by.epam.learn;

import java.util.*;

public class AddTaskFirst {

        private static final int FROM = 10;
        private static final int TO = 42;
        private static int N;

        private static boolean isInRange(int value) {
            return value >= FROM && value <= TO;
        }

        private static boolean isNumber(String str) {
            return str.matches("-?\\d+");
        }

        private static int HashArray(int x) {
            HashSet var;
            for(var = new HashSet(); x > 0; x /= 10) {
                var.add(x % 10);
            }

            return var.size();
        }

        public static void main(String[] args) {
            System.out.println("The main task from mirzaf4eg:");
            System.out.println("\nThe third task: Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.");
            AddTaskFirst.RandomNum num = new AddTaskFirst.RandomNum();
            num.setN();
            num.setMyArray();
            num.showMyArray();
            num.GetMaxMin();
            num.SortMyArray();
            num.MediumLength();
            num.MoLessAver();
            num.DifMyArray();
//            num.ChetNecht();
        }

        static class RandomNum {
            Scanner in;
            Random random;
            private Integer[] myArray;
            double aver;

            RandomNum() {
                this.in = new Scanner(System.in);
                this.random = new Random();
                this.aver = 0.0D;
            }

            public void setN() {
                System.out.println("Dear friend, enter the number of random numbers and I will show them to you (10-42): ");

                while(true) {
                    while(true) {
                        String line = this.in.nextLine();
                        if (AddTaskFirst.isNumber(line)) {
                            AddTaskFirst.N = Integer.parseInt(line);
                            this.myArray = new Integer[AddTaskFirst.N];
                            if (AddTaskFirst.isInRange(AddTaskFirst.N)) {
                                System.out.println("You are the best. Look what happened!");
                                return;
                            }

                            System.out.println("Not bad, but something went wrong. Try again: ");
                        } else {
                            System.out.println("Not bad, but something went wrong. Try again: ");
                        }
                    }
                }
            }

            public void setMyArray() {
                for(int i = 0; i < AddTaskFirst.N; ++i) {
                    this.myArray[i] = this.random.nextInt(100000);
                }

            }

            public void showMyArray() {
                System.out.print("Here are " + AddTaskFirst.N + " random numbers for you without a newline: ");
                Integer[] var1 = this.myArray;
                int var2 = var1.length;

                int var3;
                int j;
                for(var3 = 0; var3 < var2; ++var3) {
                    j = var1[var3];
                    System.out.print(j + " ");
                }

                System.out.println();
                System.out.println("Here are " + AddTaskFirst.N + " random numbers with a newline: ");
                var1 = this.myArray;
                var2 = var1.length;

                for(var3 = 0; var3 < var2; ++var3) {
                    j = var1[var3];
                    System.out.println(j);
                }

            }

            public void GetMaxMin() {
                int numMax = this.myArray[0];
                int numMin = this.myArray[0];
                Integer[] var3 = this.myArray;
                int var4 = var3.length;

                int var5;
                int i;
                for(var5 = 0; var5 < var4; ++var5) {
                    i = var3[var5];
                    if (i > numMax) {
                        numMax = i;
                    }
                }

                var3 = this.myArray;
                var4 = var3.length;

                for(var5 = 0; var5 < var4; ++var5) {
                    i = var3[var5];
                    if (i < numMin) {
                        numMin = i;
                    }
                }

                System.out.println("Самое большое число, вероятно, оно и длинное: " + numMax);
                System.out.println("Самое маленькое число, вероятно, оно и короткое: " + numMin);
                System.out.println("Самое длинное число имеет длину: " + String.valueOf(numMax).length());
                System.out.println("Самое короткое число имеет длину: " + String.valueOf(numMin).length());
            }

            public void SortMyArray() {
                System.out.println("Отсортируем наши цифры по возрастанию и длине: ");
                Arrays.sort(this.myArray);
                Integer[] var1 = this.myArray;
                int var2 = var1.length;

                int var3;
                Integer j;
                for(var3 = 0; var3 < var2; ++var3) {
                    j = var1[var3];
                    System.out.println(j + " " + String.valueOf(j).length());
                }

                System.out.println("Отсортируем наши цифры по убыванию и длине: ");
                Arrays.sort(this.myArray, Collections.reverseOrder());
                var1 = this.myArray;
                var2 = var1.length;

                for(var3 = 0; var3 < var2; ++var3) {
                    j = var1[var3];
                    System.out.println(j + " " + String.valueOf(j).length());
                }

            }

            public void MediumLength() {
                int[] d = new int[AddTaskFirst.N];
                int l = 0;
                Integer[] var3 = this.myArray;
                int var4 = var3.length;

                for(int var5 = 0; var5 < var4; ++var5) {
                    int j = var3[var5];
                    d[l] = String.valueOf(j).length();
                    ++l;
                }

                for(int i = 0; i < AddTaskFirst.N; ++i) {
                    this.aver += (double)d[i];
                }

                this.aver /= (double)AddTaskFirst.N;
                System.out.println("Средняя длина чисел: " + this.aver + " (" + Math.round(this.aver) + ")");
            }

            public void MoLessAver() {
                System.out.println("Числа, длинна которых больше средней: ");
                Integer[] var1 = this.myArray;
                int var2 = var1.length;

                int var3;
                Integer j;
                for(var3 = 0; var3 < var2; ++var3) {
                    j = var1[var3];
                    if (this.aver < (double)String.valueOf(j).length()) {
                        System.out.println(j + " " + String.valueOf(j).length());
                    }
                }

                System.out.println("Числа, длинна которых меньше средней: ");
                var1 = this.myArray;
                var2 = var1.length;

                for(var3 = 0; var3 < var2; ++var3) {
                    j = var1[var3];
                    if (this.aver > (double)String.valueOf(j).length()) {
                        System.out.println(j + " " + String.valueOf(j).length());
                    }
                }

            }

            public void DifMyArray() {
                int min = AddTaskFirst.HashArray(this.myArray[0]);
                int minElement = this.myArray[0];

                for(int i = 1; i < this.myArray.length; ++i) {
                    if (AddTaskFirst.HashArray(this.myArray[i]) < min) {
                        min = AddTaskFirst.HashArray(this.myArray[i]);
                        minElement = this.myArray[i];
                    }
                }

                System.out.println("Первое число, в котором количество различных цифр минимально: " + minElement);
            }

            public void ChetNecht() {
                int chetDig = 0;
                int nechetDig = 0;
                int chetDigOut = 0;
                int DigOut = 0;

                ArrayList myDinArray;
                Integer[] var6;
                int var7;
                for(myDinArray = new ArrayList(); this.myArray[AddTaskFirst.N] != 0; var6[var7] = var6[var7] / 10) {
                    myDinArray.add(this.myArray[AddTaskFirst.N] % 10);
                    var6 = this.myArray;
                    var7 = AddTaskFirst.N;
                }

                Iterator var8 = myDinArray.iterator();

                while(var8.hasNext()) {
                    Integer integer = (Integer)var8.next();
                    if (integer % 2 == 0) {
                        ++chetDig;
                    } else {
                        ++nechetDig;
                    }
                }

                if (chetDig == myDinArray.size()) {
                    ++chetDigOut;
                } else if (chetDig == nechetDig) {
                    ++DigOut;
                }

                System.out.println("Количество чисел, содержащих только четные цифры: " + chetDigOut);
                System.out.println("Количество чисел с равным числом четных и нечетных цифр: " + DigOut);
            }
        }
}

