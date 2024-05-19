package lab11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class samTask10 {
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

        int[] arrResult = findMinNum(arr, minNum);

        System.out.println("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));

    }

    public static int[] findMinNum (int[] arr, int maxNum) {
        return Arrays.stream(arr)
                .filter(x -> x < maxNum)
                .toArray();
    }
}
