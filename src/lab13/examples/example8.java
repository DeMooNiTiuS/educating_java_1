package lab13.examples;

public class example8 {
    public static int m () {
        try {
            System.out.println("0");
            //throw new RuntimeException();
        }
        finally {
            System.out.println("1");
        }
        return 55;
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
