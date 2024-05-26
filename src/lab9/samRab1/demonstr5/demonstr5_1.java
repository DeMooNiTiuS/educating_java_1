package lab9.samRab1.demonstr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demonstr5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество человек в кругу: ");
        int n = scanner.nextInt();

        long start = System.currentTimeMillis();
        List<Integer> peopleInCircle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            peopleInCircle.add(i);
        }

        int count = 0;
        while (peopleInCircle.size() > 1) {
            count++;
            int place = (count - 1) % peopleInCircle.size();
            peopleInCircle.remove(place);
        }

        System.out.println("Победитель: " + peopleInCircle.get(0));
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения операции добавления ArrayList = " + (end-start));
    }
}
