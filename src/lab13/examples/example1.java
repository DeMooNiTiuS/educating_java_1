package lab13.examples;

public class example1 {
    public static void main(String[] args) {
        try{
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) {      //Исключение перехвачено
            System.out.println("1 " + e);   //Исключение обработано
        }
        System.out.println("2");
    }
}
