package lab11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class samTask8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        int minNum = 120;

        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(200);
        }

        System.out.println("Массив arr1: ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = findMaxNum(arr, minNum);

        System.out.println("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));

    }

    public static int[] findMaxNum (int[] arr, int minNum) {
        return Arrays.stream(arr)
                .filter(x -> x > minNum)
                .toArray();
    }
}
