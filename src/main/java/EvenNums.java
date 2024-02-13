import java.util.Scanner; // Импортируем класс Scanner
public class EvenNums {
    public static void main(String[] args) {
        // Создание маассива целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Чётные числа в массиве:");
        // Перебираем элементы массива
        for (int number : numbers) {
            // Проверяем на чётность
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

}
