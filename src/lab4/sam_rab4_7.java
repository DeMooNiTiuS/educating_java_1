package lab4;
import java.util.Scanner;

public class sam_rab4_7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("введите количество строк массива: ");
        int a =id.nextInt();
        System.out.print("введите количество столбцов массива: ");
        int b = id.nextInt();

        int[][] ZmeykaArray = new int[a][b];
        int end = 0;
        int body = 0;
        int h = 0;
        for (int i = 0; h < ZmeykaArray.length ; h++) {
            for (int j = 0; j <(ZmeykaArray[i].length - end); j++) {
                ZmeykaArray[i][j] = body;
                body++;
            }
            if(i< ZmeykaArray.length-1) {
                i++;}
            for (int o=a-1; o > end; o--) {
                ZmeykaArray[o][ZmeykaArray[i].length-1-end] = body;
                body++;
            }
            end++;
        }
        int z = 0;
        for (int i = 0; i < ZmeykaArray.length; i++){
            int count = i+1;
            for (int j = 0; j < ZmeykaArray[i].length; j++){
                System.out.print(ZmeykaArray[i][j]+" ");
                z++;
            }
            System.out.println();
            z = 0;
        }
    }
}
