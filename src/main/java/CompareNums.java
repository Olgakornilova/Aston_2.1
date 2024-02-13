import java.util.Scanner; // Импортируем класс Scanner

public class CompareNums {
    public static void main(String[] args) { // Меняем название метода на main для удобства
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Сравниваем числа и возвращаем в main1
        if(a > b){
            System.out.println("a > b");
        } else if(a < b){
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Сложение
        System.out.println("a + b = " + (a + b));

        // Вычитание
        System.out.println("a - b = " + (a - b));

        // Умножение
        System.out.println("a * b = " + (a * b));

        // Деление с проверкой деления на ноль
        if (b != 0) {
            System.out.println("a / b = " + ((double) a / b));
        } else {
            System.out.println("Деление на ноль невозможно.");
        }

    }
}
