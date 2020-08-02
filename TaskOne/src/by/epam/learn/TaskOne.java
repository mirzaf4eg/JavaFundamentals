// Приветствовать любого пользователя при вводе его имени через командную строку

package by.epam.learn;
import java.util.Scanner; // Импортируем сканер, для считывания вводимых данных с консоли

public class TaskOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Объявляем объект и инициализируем
        System.out.println("The main task from mirzaf4eg:");
        System.out.println("\nThe first task: Приветствовать любого пользователя при вводе его имени через командную строку.");
        System.out.println("Hello, my name is mirzaf4eg, and im alcoholic! And You? ");
        String user = in.nextLine(); // Строковый ввод. Помещаем вводимые данные в переменную user
        System.out.println("Hello, " + user + "! " + "Tell us your story."); // Приветствуем пользователя
    }
}
