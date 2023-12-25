package lab6;
import java.util.Arrays;

public class sam_rab6_9 {
    public static void main(String[] args) {
        char[] arrayOfChar = {'q','w','e','r','t','y'};
        char[] arrayOfChar2 = {'q','w','e','r','t','y','u'};

        System.out.println(Arrays.toString(arrayOfChar));
        System.out.println(Arrays.toString(changeChar(arrayOfChar)));

        System.out.println(Arrays.toString(arrayOfChar2));
        System.out.println(Arrays.toString(changeChar(arrayOfChar2)));
    }
    public static char[] changeChar(char[] array)
    {
        for(int i=0;i<array.length/2;i++) {
            char currentChar = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i]=currentChar;
        }
        return array;
    }
}
