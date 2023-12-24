package lab4;
import java.util.Random;

public class sam_rab4_5 {
    public static void main(String[] args) {
        Random VBR = new Random();

        int k = 10;
        int m = 6;

        int[][] ArrayRandomNums = new int[k][m];

        for (int i = 0; i < ArrayRandomNums.length; i++){
            for (int j = 0; j < ArrayRandomNums[i].length; j++){
                ArrayRandomNums[i][j] = VBR.nextInt(100);
            }
        }

        for (int i = 0; i < ArrayRandomNums.length; i++){
            for (int j = 0; j < ArrayRandomNums[i].length; j++){
                System.out.print(ArrayRandomNums[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("После перестановки: ");
        System.out.println();

        int a = m;
        int b = k;

        int[][] ArrayPeredel = new int[a][b];

        for (int i = 0; i < ArrayPeredel.length; i++){
            for (int j = 0; j < ArrayPeredel[i].length; j++){
                ArrayPeredel[i][j] = ArrayRandomNums[j][i];
            }
        }

        for (int i = 0; i < ArrayPeredel.length; i++){
            for (int j = 0; j < ArrayPeredel[i].length; j++){
                System.out.print(ArrayPeredel[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
