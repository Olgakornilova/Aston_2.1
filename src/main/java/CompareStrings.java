import java.util.Scanner; // Импортируем класс Scanner
public class CompareStrings {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Вводим первую строку
            System.out.print("Введите первую строку (a): ");
            String a = scanner.nextLine();

            // Вводим вторую строку
            System.out.print("Введите вторую строку (b): ");
            String b = scanner.nextLine();

            // Сравниваем строки и выводим результат
            if (a.equals(b)) {
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны");
            }
        }

}
