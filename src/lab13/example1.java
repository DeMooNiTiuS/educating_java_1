package lab13;

import java.util.Scanner;

public class example1 {
    static int m1() {
        return m2() * 10;
    }

    static int m2() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        return 10 / x;
    }

    public static void main(String[] args) {
        System.out.println("" + m1());
    }
}
