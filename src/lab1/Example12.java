package lab1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input age: ");
        int age = in.nextInt();

        // Получение текущего значения даты в системе
        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();

        var YoB = current_Year - age;

        System.out.printf("Your age: %d \n", YoB);
        in.close();
    }
}
