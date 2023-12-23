package lab3;

import java.util.Scanner;

public class sam_rab2 {
    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);
        System.out.print("Введите название дня недели (ввод производить с заглавной буквы): ");
        var dayOfWeek = id.nextLine();

        switch (dayOfWeek) {
            case ("Понедельник") -> System.out.println("Номер дня недели 1");
            case ("Вторник") -> System.out.println("Номер дня недели 2");
            case ("Среда") -> System.out.println("Номер дня недели 3");
            case ("Четверг") -> System.out.println("Номер дня недели 4");
            case ("Пятница") -> System.out.println("Номер дня недели 5");
            case ("Суббота") -> System.out.println("Номер дня недели 6");
            case ("Воскресенье") -> System.out.println("Номер дня недели 7");
            default -> System.out.println("Введенное число за пределами диапазона 1-7. Повторите ввод");
        }
    }
}
