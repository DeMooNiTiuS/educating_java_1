package lab6;

public class sam_rab6_4class {
    public static int factorial2(int number){
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial2(number - 2);
    }
}
