package lab5;

public class sam_rab5_4class {
    private char symbol;
    private int number;
    sam_rab5_4class(int i, char c) {
        this.symbol = c;
        this.number = i;
        int length = (int) (Math.log10(number) + 1);
        double result = (double) symbol + (double) number * 1 / Math.pow(10, length);
        System.out.println("result1 = " + result + "; ch = " + (double) symbol + "; int = " + length + "\n");
    }
    sam_rab5_4class(double d) {
        char ch1 = (char) d;
        number = (int) ((d - (int) d) * 100);
        System.out.println("ch = " + ch1 + "; int = " + number + "\n");
    }
}
