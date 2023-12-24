package lab4;
import java.util.Random;
import java.util.Scanner;

public class sam_rab4_6 {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int sizeRow = id.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int sizeColumn = id.nextInt();

        int firstArray[][] = new int[sizeRow][sizeColumn];
        for (int i = 0 ; i <sizeRow; i++) {
            for (int j = 0 ; j <sizeColumn; j++) {
                firstArray[i][j] = random.nextInt(200);
                System.out.print(firstArray[i][j]+"\t");
            }
            System.out.println();
        }

        int deleteRow = random.nextInt(sizeRow-1);
        int deleteColumn = random.nextInt(sizeColumn-1);

        System.out.println();
        System.out.println("Удаляем строку = "+(deleteRow)+"; Удаляем колонку= "+(deleteColumn));
        System.out.println();

        int secondArray[][] = new int[sizeRow-1][sizeColumn-1];
        for (int i=0, s = 0; i<sizeRow-1; s++) {
            if (s!=deleteRow){
                for (int j =0, k = 0 ; j <sizeColumn-1; k++) {
                    if (k != deleteColumn) {
                        secondArray[i][j] = firstArray[s][k];
                        System.out.print(secondArray[i][j]+"\t");
                        j++;
                    }
                }
                i++;
                System.out.println();
            }
        }
    }
}
