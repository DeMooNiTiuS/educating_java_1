package lab3;
import java.util.Arrays;
import java.util.Scanner;

public class sam_rab6 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = id.nextInt();

        //Проверка на число больше 1 для составления массива
        if(size>=1) {
            System.out.println("\nРазмер массива равен " + size);
            int[] nums = new int[size];
            int numForSumm = 0;

            for (int i = 0; i < size; i++) {
                if (numForSumm % 5 == 2) {
                    nums[i] = numForSumm;
                    numForSumm++;
                } else {
                    numForSumm++;
                    i--;
                }
            }
            System.out.print("Данный массив имеет вид: ");
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]+" ");
            }
        }
        else {
            System.out.println("Введены недопустимые значения. \nПовторите попытку");
        }
    }
}
