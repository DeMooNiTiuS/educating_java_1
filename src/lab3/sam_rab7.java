package lab3;
import java.util.Arrays;

public class sam_rab7 {
    public static void main(String[] args) {

        char[] Alphabet  = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        int c=0;
        char[] alpha_1 = new char[10];
        for (int i=0;i<alpha_1.length;i++)
        {
            alpha_1[i]=Alphabet[c];
            System.out.print(alpha_1[i]+" ");
            c+=2;
        }
        System.out.println();
        for (int i = alpha_1.length - 1 ; i >= 0; i--){
            System.out.print(alpha_1[i] + " ");
        }
    }
}
