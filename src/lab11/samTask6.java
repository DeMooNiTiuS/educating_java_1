package lab11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class samTask6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        System.out.println("Введите число на которое будет делиться без остатка");
        int num = in.nextInt();

        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }

        System.out.println("Массив arr: ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = filterNumbersMod(arr, num);
        System.out.println("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] filterNumbersMod (int[] arr, int num){
        return Arrays.stream(arr).filter(x -> x % num == 0).toArray();
    }
}
