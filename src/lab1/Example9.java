package lab1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input Month: ");
        int Month = in.nextInt();

        System.out.println("Input number of days: ");
        int NoF = in.nextInt();

        System.out.printf("Current month: %d contains: %d\n", Month, NoF);
        in.close();
    }
}
