package lab1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input Day: ");
        int Day = in.nextInt();

        System.out.println("Input Month: ");
        int Month = in.nextInt();

        System.out.println("Input Year: ");
        int Year = in.nextInt();

        System.out.printf("Today's date: %d.%d.%d \n", Day, Month, Year);
        in.close();
    }
}
