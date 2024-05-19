package lab11;

import java.util.ArrayList;
import java.util.List;

public class samTask9 {
    public static void main(String[] args) {
        String string = "9. Напишите функцию, Которая принимает на вход список "
                +"строк и возвращает новый список. Содержащий только те строки, "
                +"которые содержат только буквы (без цифр и символов).";
        List<String> strings = List.of(string.split(" "));

        System.out.println("\n" + "Строка после сплитования: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterWordsStrings(strings);

        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterWordsStrings (List<String> list) {
        List<String> lettersOnlyString = new ArrayList<>();
        for (String string : list) {
            if (string.matches("[а-яА-Я]+")) {
                lettersOnlyString.add(string);
            }
        }
        return lettersOnlyString;
    }
}
