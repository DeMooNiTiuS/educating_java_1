package lab6;
import java.util.Arrays;

public class sam_rab6_7 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'g','h','i','m','n','o','x', 'y'};

        int[] code = GetCode(array);

        System.out.println(Arrays.toString(code));
    }
    public static int[] GetCode(char[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = (int) array[i];
        }
        return result;
    }
}
