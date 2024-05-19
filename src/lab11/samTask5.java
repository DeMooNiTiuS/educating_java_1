package lab11;

import java.util.List;

public class samTask5 {
    public static void main(String[] args) {
        String string = "Напишите функцию, Которая принимает на вход список "
                +"строк и возвращает новый список. Содержащий только те строки, "
                +"которые содержат заданную подстроку.";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        //??????????
        String substring = "ок";

        List<String> stringsAfter = filterSubstring(strings, substring);

        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterSubstring (List<String> list, String subStr) {
        return list.stream()
                .filter(s -> list.contains(subStr))
                .toList();
    }
}
