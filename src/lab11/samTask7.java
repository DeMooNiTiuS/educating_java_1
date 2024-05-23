package lab11;

import java.util.List;

public class samTask7 {
    public static void main(String[] args) {
        String string = "Напишите функцию, Которая принимает на вход список "
                +"строк и возвращает новый список. Содержащий только те строки, "
                +"которые имеют длину больше заданного значения.";
        List<String> strings = List.of(string.split(" "));
        int minLen = 9;

        System.out.println("\n" + "Строка после сплитования: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterLengthStrings(strings, minLen);

        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterLengthStrings (List<String> list, int minLen) {
        return list.stream()
                .filter(s -> s.length() > minLen)
                .toList();
    }
}
