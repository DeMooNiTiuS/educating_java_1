package lab10.samrabTask_2_4;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class JsonParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Json Parser v3.0
                    Выберите действие:
                    1. Показать список книг
                    2. Поиск книг по автору
                    3. Добавление новой книги
                    4. Удаление книги по названию
                    0. Выход""");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    browseBook();
                    break;
                case 2:
                    searchByAuthor();
                    break;
                case 3:
                    addNewBook();
                    break;
                case 4:
                    removeOldBook();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
                    break;
            }
            System.out.println("\n");
        }
    }
    public static void browseBook() {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lab10/samrabTask_2_4/books-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void searchByAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя автора:");
        String author = scanner.nextLine();

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lab10/samrabTask_2_4/books-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            Object booksObj = jsonObject.get("books");

            if (booksObj instanceof JSONArray) {
                JSONArray jsonArray = (JSONArray) booksObj;
                System.out.println("Результаты поиска для автора " + author + ":");
                boolean found = false;
                for (Object o : jsonArray) {
                    JSONObject book = (JSONObject) o;
                    if (book.get("author").equals(author)) {
                        System.out.println("Название книги: " + book.get("title"));
                        System.out.println("Год издания: " + book.get("year"));
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Книги данного автора не найдены.");
                }
            } else {
                System.out.println("Ошибка: структура данных нарушена.");
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static void addNewBook() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название книги: ");
            String title = scanner.nextLine();
            System.out.println("Введите автора книги: ");
            String author = scanner.nextLine();
            System.out.println("Введите год издания книги: ");
            int year = scanner.nextInt();

            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lab10/samrabTask_2_4/books-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            JSONObject newBook = new JSONObject();
            newBook.put("title", title);
            newBook.put("author", author);
            newBook.put("year", year);
            jsonArray.add(newBook);

            jsonObject.put("books", jsonArray);

            FileWriter fileWriter = new FileWriter("src/lab10/samrabTask_2_4/books-json.json");
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.flush();
            fileWriter.close();

            System.out.println("Книга успешно добавлена.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void removeOldBook() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название книги, которую необходимо удалить: ");
            String title = scanner.nextLine();

            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lab10/samrabTask_2_4/books-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            boolean found = false;
            Iterator<Object> iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (book.get("title").equals(title)) {
                    iterator.remove();
                    found = true;
                    break;
                }
            }

            if (found) {
                jsonObject.put("books", jsonArray);
                FileWriter fileWriter = new FileWriter("src/lab10/samrabTask_2_4/books-json.json");
                fileWriter.write(jsonObject.toJSONString());
                fileWriter.flush();
                fileWriter.close();
                System.out.println("Книга успешно удалена.");
            } else {
                System.out.println("Книга с таким названием не найдена.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
