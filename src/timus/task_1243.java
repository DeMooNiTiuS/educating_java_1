package timus;

import java.util.Scanner;

public class task_1243 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        long numOfItem = in.nextLong();

        long numItemForGnoms = numOfItem/7;
        long numItemForBel = numOfItem-numItemForGnoms*7;

        System.out.printf("Белоснежка получит %d предметов после развода.", numItemForBel);
    }
}