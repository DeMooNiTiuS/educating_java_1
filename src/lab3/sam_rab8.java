package lab3;
import java.util.Arrays;

public class sam_rab8 {
    public static void main(String[] args) {
        int n = 10;
        char[] charArray = new char[n];
        char letter = 'A';
        int i = 0;
        int j = 0;

        while(j < n){
            if(i % 4 > 0 || letter == (char)77){
                charArray[j] = letter;
                j++;
            }
            letter++;
            i++;
        }
        for(int q = 0; q < n; q++){
            System.out.print(charArray[q] + " ");
        }
    }
}
