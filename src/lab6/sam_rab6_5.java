package lab6;

public class sam_rab6_5 {
    public static void main(String[] args) {
        System.out.println(naturalSquare(4));
        System.out.println(naturalSquare(12));
    }

    public static int naturalSquare(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i * i;
        }
        return result;
    }
}
