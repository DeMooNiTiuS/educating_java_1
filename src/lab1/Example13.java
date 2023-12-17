package lab1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int fNum = in.nextInt();

        System.out.print("Input second number: ");
        int sNum = in.nextInt();

        int sum = fNum + sNum;

        System.out.printf("The sum of the numbers: %d \n", sum);
        in.close();
    }
}
