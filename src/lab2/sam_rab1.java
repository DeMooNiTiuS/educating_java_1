package lab2;

import java.util.Scanner;

public class sam_rab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = in.nextInt();

        if (num%3==0)
        {
            System.out.println("Введенное число кратно 3-м.");
        }
        else
        {
            System.out.println("Введенное число не кратно 3-м.");
        }
    }
}
