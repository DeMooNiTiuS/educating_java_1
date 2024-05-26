package lab9.samRab1;

import java.util.Scanner;

public class demonstr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите десятичное число: ");
        int number = scanner.nextInt();
        System.out.println("Введенное десятичное число: " + number);
        System.out.print("После конвертации в двоичную систему: ");
        convertToBynary(number);
    }

    public static void convertToBynary(int num) {
        if (num>0) {
            convertToBynary(num/2);
            System.out.print(num % 2 + " ");
        }
    }
}
