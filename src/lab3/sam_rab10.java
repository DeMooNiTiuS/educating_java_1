package lab3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sam_rab10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = id.nextInt();

        int[] nums = new int[size];
        Random random = new Random();

        System.out.print("Элементы массива: ");
        for (int i=0;i< nums.length;i++)
        {
            nums[i]=random.nextInt(200);
            System.out.print(nums[i]+" ");
        }
        Arrays.sort(nums);

        System.out.print("\nЭлементы массива после сортировки:");
        for(int i=nums.length-1; i>=0;i--)
        {
            System.out.print(" "+nums[i]);
        }
    }
}
