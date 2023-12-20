package lab2;

import java.util.Scanner;

public class sam_rab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = in.nextInt();

        if (num%4==0 && num>=10)
        {
            System.out.println("Введенное число делится на 4 оно больше 10");
        }
        else
        {
            System.out.println("Введенное число не удовлетворяет условиям.");
        }
    }
}
