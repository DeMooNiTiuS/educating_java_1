package lab6;
import java.util.Arrays;

public class sam_rab6_10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maximum(2)));
        System.out.println(Arrays.toString(maximum(2,5)));
        System.out.println(Arrays.toString(maximum(14,6,68,19)));
    }
    public static int[] maximum(int... numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        int[] MinMaxArray;
        if(numbers.length>1) {
            MinMaxArray = new int[2];
            MinMaxArray[0] = min;
            MinMaxArray[1] = max;
        }
        else {
            MinMaxArray = new int[1];
            MinMaxArray[0] = max;
        }
        return MinMaxArray;
    }
}
