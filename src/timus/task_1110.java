package timus;
import java.util.Scanner;

public class task_1110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите через пробел числа N, M, Y через пробел: ");
        String numOfItem = in.nextLine();

        int N=0;
        int M=0;
        int Y=0;
        int X=0;
        String result="";
        String [] parts= numOfItem.split (" ");

        if(parts.length == 3)
        {
            N = Integer.parseInt(parts[0]);
            M = Integer.parseInt(parts[1]);
            Y = Integer.parseInt(parts[2]);

            if (N>0 && M>0 && Y>0 && N<999 && M<999 && Y<999)
            {
                for (X = 0; X <= (M - 1); X++)
                {
                    if ((Math.pow(X, N) % M) == Y)
                    {
                        result += X + " ";
                    }
                }
                if (result.equals(""))
                {
                    System.out.printf("-1");
                } else
                {
                    System.out.printf(result);
                }
            }
            else
            {
                System.out.print("Данные введены не корректно. Перезапустите программу");
            }
        }
        else
        {
            System.out.print("Данные введены не корректно. Перезапустите программу");
        }
    }
}
