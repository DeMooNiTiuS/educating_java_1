package timus15;

import java.util.Scanner;

public class task1243 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long numOfItem = in.nextLong();

        long numItemForG = numOfItem/7;
        int numItemForBel = (int) (numOfItem-numItemForG*7);

        System.out.println(numItemForBel);
    }
}
