package lab5;

import java.util.Scanner;

public class sam_rab5_3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите num1: ");
        int int1 = id.nextInt();
        System.out.print("Введите num2: ");
        int int2 = id.nextInt();
        sam_rab5_3class request1 = new sam_rab5_3class();
        sam_rab5_3class request2 = new sam_rab5_3class(int1);
        sam_rab5_3class request3 = new sam_rab5_3class(int1,int2);
    }
}
