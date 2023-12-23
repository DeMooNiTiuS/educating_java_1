package lab3;
import java.util.Scanner;

public class sam_rab5v2 {
    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество чисел в сумме: ");
        int num = id.nextInt();

        int numForSumm = 0;
        int result=0;
        String message="";

        int i=0;
        while(i<num)
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
            i++;
        }
        System.out.print("Числа в последовательности из ["+num+"] чисел: "+message+"\nДают в сумме: "+result);
    }
}
