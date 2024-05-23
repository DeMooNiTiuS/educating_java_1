package lab13.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] byteArray = null;
        int sum = 0;
        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            byteArray = new byte[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Введите элемент под номером " + (i + 1) + ": ");
                byteArray[i] = scanner.nextByte();
                sum += byteArray[i];
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: ввод или вычисление значения за границами диапазона типа");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенная строка не может быть преобразована в число типа byte");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за пределы массива");
        }
        if (byteArray != null) {
            System.out.println("Сумма элементов массива: " + sum);
        }
    }
}
