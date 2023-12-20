package lab2;

import java.util.Scanner;

public class sam_rab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = in.nextInt();

        int CountThousand = num/1000;

        if(CountThousand>0)
        {
            System.out.printf("Введенное число содержит %d тысяч", CountThousand);
        }
        else
        {
            System.out.print("Введенное число не содержит тысячи");
        }
    }
}
