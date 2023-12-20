package lab2;

import java.util.Scanner;

    public class sam_rab2 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = in.nextInt();

        if (num%5==2 && num%7==1)
        {
            System.out.println("Введенное число делится на 5 с остатком 2 и на 7 с остатком 1.");
        }
        else
        {
            System.out.println("Введенное число не удовлетворяет условиям.");
        }
    }
}
