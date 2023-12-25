package lab6;
import java.util.Arrays;

public class sam_rab6_6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(clay(array, 3)));
        System.out.println(Arrays.toString(clay(array, 9)));
    }
    public static int[] clay(int[] array, int num) {
        if (num > array.length) {
            return Arrays.copyOf(array, array.length);
        }

        return Arrays.copyOfRange(array, 0, num);
    }
}
