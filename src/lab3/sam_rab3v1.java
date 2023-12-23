package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class sam_rab3v1 {
    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int size = id.nextInt();

        int Num =1;
        int[] fibbonaci = new int[size];

        for (int i=0;i< fibbonaci.length;i++)
        {
            if(i==0 || i==1) {
                fibbonaci[i] = Num;
            }
            else {
                Num = fibbonaci[i-1]+fibbonaci[i-2];
                fibbonaci[i] = Num;
            }
        }
        System.out.print("Последовательность из "+size+" чисел: ");
        for (int j=0;j< fibbonaci.length;j++)
        {
            System.out.print(fibbonaci[j]+" ");
        }
    }
}
