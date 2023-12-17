package lab1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input First name: ");
        String FirstName = in.nextLine();

        System.out.println("Input Last name: ");
        String LastName = in.nextLine();

        System.out.println("Input Middle name: ");
        String MiddleMame = in.nextLine();

        String FullName = LastName + " " + FirstName + " " + MiddleMame;

        System.out.printf("Hello: %s", FullName);
        in.close();
    }
}
