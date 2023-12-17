package lab1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int fNum = in.nextInt();

        System.out.print("Input second number: ");
        int sNum = in.nextInt();

        int Result = fNum-sNum;

        System.out.printf("Result: %d",Result);
        in.close();
    }
}
