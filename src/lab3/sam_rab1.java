package lab3;
import java.util.Scanner;

public class sam_rab1 {
    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);
        System.out.print("Введите целое число в диапазоне от 1 до 7: ");
        int dayOfWeek = id.nextInt();

        switch (dayOfWeek) {
            case (1) -> System.out.println("Сегодня понедельник");
            case (2) -> System.out.println("Сегодня вторник");
            case (3) -> System.out.println("Сегодня среда");
            case (4) -> System.out.println("Сегодня четверг");
            case (5) -> System.out.println("Сегодня пятница");
            case (6) -> System.out.println("Сегодня суббота");
            case (7) -> System.out.println("Сегодня воскресенье");
            default -> System.out.println("Введенное число за пределами диапазона 1-7. Повторите ввод");
        }
    }
}
