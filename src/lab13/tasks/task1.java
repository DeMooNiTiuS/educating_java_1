package lab13.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int n = scanner.nextInt();

            // Создание нового массива
            int[] arr = new int[n];

            // Запись элементов одномерного массива
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    sum += arr[i];
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Отсутствуют положительные элементы в массиве");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение: " + average);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка. Введенные данные имеют неверный тип. Требуется ввести целое число.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
