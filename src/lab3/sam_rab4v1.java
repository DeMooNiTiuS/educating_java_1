package lab3;
import java.util.Scanner;

public class sam_rab4v1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int firstNum = id.nextInt();
        System.out.print("Введите второе целое число: ");
        int secondNum = id.nextInt();

        int[] firstArray = new int[Math.abs(firstNum-secondNum)+1];
        int start = 0;

        if(firstNum<secondNum){
            start=firstNum;
        }
        else {
            start=secondNum;
        }

        System.out.print("Из вводных данных получается следующая последовательность целых чисел: ");
        for(int i=0; i<firstArray.length;i++) {
            firstArray[i] = start;
            start += 1;
            System.out.print(firstArray[i]+" ");
        }
    }
}
