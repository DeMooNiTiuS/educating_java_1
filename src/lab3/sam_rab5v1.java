package lab3;
import java.util.Scanner;

public class sam_rab5v1 {
    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество чисел в сумме: ");
        int num = id.nextInt();

        int numForSumm = 0;
        int result=0;
        String message="";

        for(int i=0; i<num; i++)
        {
            if(numForSumm%5 == 2 || numForSumm%3 == 1)
            {
                result+=numForSumm;
                message+=numForSumm+" ";
                numForSumm++;
            }
            else
            {
                numForSumm++;
                i--;
            }
        }
        System.out.print("Числа в последовательности из ["+num+"] чисел: "+message+"\nДают в сумме: "+result);
    }
}
