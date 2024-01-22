package timus15;

import java.util.Scanner;

public class task1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int numOfM = m + 1;

        int result = n * numOfM;

        System.out.println(result);
    }
}
