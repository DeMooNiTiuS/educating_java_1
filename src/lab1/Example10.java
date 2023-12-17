package lab1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input year of birth: ");
        int YoB = in.nextInt();

        // Получение текущего значения даты в системе
        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();

        var age = current_Year-YoB;

        System.out.printf("Your age: %d \n", age);
        in.close();
    }
}
