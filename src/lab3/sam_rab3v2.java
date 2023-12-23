package lab3;
import java.util.Scanner;

public class sam_rab3v2 {
    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int size = id.nextInt();

        int Num =1;
        int[] fibbonaci = new int[size];

        int i=0;
        while (i< fibbonaci.length) {
            if(i==0 || i==1) {
                fibbonaci[i] = Num;
            }
            else {
                Num = fibbonaci[i-1]+fibbonaci[i-2];
                fibbonaci[i] = Num;
            }
            i++;
        }
        System.out.print("Последовательность из "+size+" чисел: ");

        int j = 0;
        do {
            System.out.print(fibbonaci[j]+" ");
            j++;
        }
        while (j< fibbonaci.length);
    }
}
