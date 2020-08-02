// Отобразить в окне консоли аргументы командной строки в обратном порядке

package by.epam.learn;
import java.util.Scanner; // Импортируем сканер, для считывания вводимых данных с консоли

public class TaskTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Объявляем объект и инициализируем
        System.out.println("The main task from mirzaf4eg:");
        System.out.println("\nThe second task: Отобразить в окне консоли аргументы командной строки в обратном порядке.");
        System.out.println("Hello, my name is mirzaf4eg, and im alcoholic! And You? ");
        String user = in.nextLine(); // Строковый ввод. Помещаем вводимые данные в переменную user
        System.out.println("Hello, " + user + "!"); // Приветствуем пользователя
        StringBuilder reverse = new StringBuilder(user).reverse(); // Чтобы изменить введенный стринг, объявляем стрингбилдер, которому присваеваем прореверсированные методом revers() введенные данные
        System.out.println("Look how awesome your name looks in reverse!: " + reverse); // Вывод в консоль аргументов в обратном порядке
    }
}
