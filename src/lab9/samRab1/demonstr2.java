package lab9.samRab1;

import java.util.Scanner;

public class demonstr2 {
    private static int i = 0;
    private static int j = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arrayNums = new int[size];

        initializeArray(arrayNums);
        System.out.print("Вы получили массмв:");
        printArray(arrayNums);
    }

    public static void initializeArray (int[] arrNum) {
        if (i < arrNum.length){
            System.out.print("Введите " + (i + 1) + " элемент массива: ");
            arrNum[i] = scanner.nextInt();
            i++;
            initializeArray(arrNum);
        }

    }
    public static void printArray (int[] arrNum) {
        if (j < arrNum.length) {
            System.out.print(" " + arrNum[j]);
            j++;
            printArray(arrNum);
        }
    }
}
