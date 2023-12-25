package lab6;

public class sam_rab6_8 {
    public static void main(String[] args) {
        int[] arrayOfNums = {3, 4, 5, 6, 7, 8};

        System.out.println(averageData(arrayOfNums));
    }
    public static double averageData(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
