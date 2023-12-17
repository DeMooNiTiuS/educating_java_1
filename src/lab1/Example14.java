package lab1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int Num = in.nextInt();

        int lessNum = Num-1;
        int greaterNum = Num+1;
        int sumNum = lessNum+Num+greaterNum;
        int degree = 2;
        int Square = (int) Math.pow(sumNum,degree);

        System.out.printf("Number-1: %d \nYour number: %d \nNumber+1: %d \nSquare: %d",lessNum, Num, greaterNum, Square);
        in.close();
    }
}
