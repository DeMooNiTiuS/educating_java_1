package timus;

import java.util.Scanner;

public class task_1327 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstDay;
        int lastDay;

        do {
            System.out.print("Введите номер первого дня: ");
            firstDay = in.nextInt();

            System.out.print("Введите номер последнего дня: ");
            lastDay = in.nextInt();
        }
        while(!(1<=firstDay) || !(firstDay<=lastDay) || !(lastDay<=10000));
        int CountOfFuse;
        CountOfFuse=(lastDay-firstDay)/2;

        System.out.printf("Янус спалит злосчастный предохранитель %d раз за этот промежуток времени.", CountOfFuse);
    }
}
