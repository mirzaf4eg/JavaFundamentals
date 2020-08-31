package by.epam.learn.mirzaf4eg;

public class MainTask {
    public static void main(String[] args) {

      System.out.println("The main task from mirzaf4eg:");
// Задание первое
      System.out.println("\nThe first task: Приветствовать любого пользователя при вводе его имени через командную строку.");
      System.out.println("Hello, my name is mirzaf4eg, and im alcoholic! And You? ");
      String user = new TaskFirst().user;
      System.out.println("Hello, " + user + "! " + "Tell us your story.");
// Задание второе
      System.out.println("\nThe second task: Отобразить в окне консоли аргументы командной строки в обратном порядке.");
      System.out.println("Please, " + user + ", " + "enter the arguments command line: ");
      StringBuilder reverse = new TaskSecond().reverse;
      System.out.println("Look in reverse!: " + reverse); // Вывод в консоль аргументов в обратном порядке
// Задание третье
      System.out.println("\nThe third task: Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.");
      TaskThird myArray = new TaskThird();
          myArray.getN();
          myArray.getMyArray();
          myArray.ShowMyArray();
// Задание четвертое
      System.out.println("\nThe fourth task: Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.");
      TaskFourth num = new TaskFourth();
          num.getNum();
// Задание пятое
      System.out.println("\nThe five task: Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.");
      TaskFive month = new TaskFive();
          month.getMonth();
          month.ShowMouth();
// Первое дополнительное задание
      System.out.println("\nThe first Add_task: Ввести n чисел с консоли.");
      AddTaskFirst n = new AddTaskFirst();
          n.SetNum();
          n.GetLong();
      // Первое задание первого дополнительного задания
      System.out.println("\nThe first Add_taskOne: Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
          n.MinMaxLong();
      // Второе задание первого дополнительного задания
      System.out.println("\nThe second Add_taskOne: Вывести числа в порядке возрастания (убывания) значений их длины.");
          n.SortNum();
      // Третье задание первого дополнительного задания
      System.out.println("\nThe third Add_taskOne: Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.");
          n.MoLessAver();
      // Четвертое задание первого дополнительного задания
      System.out.println("\nThe fourth Add_taskOne: Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.");
          n.DifNum();
// Второе дополнительное задание
        System.out.println("\nThe second Add_task: Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).");
        AddTaskSecond myArrayMM = new AddTaskSecond();
            myArrayMM.SetN();
            myArrayMM.SetM();
            myArrayMM.SetMyArray();
        System.out.println("\nThe first Add_taskSecond: Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).");
            myArrayMM.SortMyArray();
    }
}


