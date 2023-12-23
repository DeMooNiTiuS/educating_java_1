package lab3;

import java.util.Scanner;

public class sam_rab2v2 {
    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);
        System.out.print("Введите название дня недели (ввод производить с заглавной буквы): ");
        var dayOfWeek = id.nextLine();

        if (dayOfWeek.equals("Понедельник"))
        {
            System.out.println("Номер дня недели 1");
        }
        else if (dayOfWeek.equals("Вторник"))
        {
            System.out.println("Номер дня недели 2");
        }
        else if (dayOfWeek.equals("Среда"))
        {
            System.out.println("Номер дня недели 3");
        }
        else if (dayOfWeek.equals("Четверг"))
        {
            System.out.println("Номер дня недели 4");
        }
        else if (dayOfWeek.equals("Пятница"))
        {
            System.out.println("Номер дня недели 5");
        }
        else if (dayOfWeek.equals("Суббота"))
        {
            System.out.println("Номер дня недели 6");
        }
        else if (dayOfWeek.equals("Воскресенье"))
        {
            System.out.println("Номер дня недели 7");
        }
        else
        {
            System.out.println("Введенное число за пределами диапазона 1-7. Повторите ввод");
        }
    }
}
