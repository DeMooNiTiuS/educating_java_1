package lab13.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите количество строк матрицы: ");
            int rows = scanner.nextInt();
            System.out.print("Введите количество столбцов матрицы: ");
            int cols = scanner.nextInt();

            int[][] matrix = new int[rows][cols];

            System.out.println("Введите элементы матрицы:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            System.out.print("Введите номер столбца для вывода: ");
            int column = scanner.nextInt();

            if ((column - 1) < 0 || (column - 1) >= cols) {
                throw new IllegalArgumentException("Столбца с номером " + column + " не существует");
            }

            System.out.println("Столбец " + column + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][column-1]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка. Введенные данные имеют неверный тип. Требуется ввести целое число.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
