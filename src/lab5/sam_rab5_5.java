package lab5;

public class sam_rab5_5 {
    public static void main(String[] args) {
        sam_rab5_5class newRequest = new sam_rab5_5class(21);
        System.out.println("Число = " + newRequest.PrintInt());

        newRequest.Set(15);
        System.out.println("Число = " + newRequest.PrintInt());

        newRequest.Set(125);
        System.out.println("Число = " + newRequest.PrintInt());

        newRequest.Set(-15);
        System.out.println("Число = " + newRequest.PrintInt());

        newRequest.Set();
        System.out.println("Число = " + newRequest.PrintInt());
    }
}
