package lab2;

import java.util.Scanner;

public class sam_rab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = in.nextInt();

        if (num>=5 && num<=10)
        {
            System.out.println("Введенное число попадает в диапазон от 5 до 10.");
        }
        else
        {
            System.out.println("Введенное число не удовлетворяет условиям.");
        }
    }
}
