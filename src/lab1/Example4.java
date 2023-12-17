package lab1;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: " + num);
        in.close();
    }
}

