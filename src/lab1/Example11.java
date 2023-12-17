package lab1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.print("Input year of birth: ");
        int YoB = in.nextInt();

        // Получение текущего значения даты в системе
        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();

        var age = current_Year-YoB;

        System.out.printf("Your name: %s \nYour age: %d \n",name , age);
        in.close();
    }
}
