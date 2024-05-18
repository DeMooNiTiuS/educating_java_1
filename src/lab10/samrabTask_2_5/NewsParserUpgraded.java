package lab10.samrabTask_2_5;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NewsParserUpgraded {
    public static void main(String[] args) {
        try (FileWriter file = new FileWriter("src/lab10/samrabTask_2_5/theme.txt")) {
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            Elements newsParent = doc
                    .select("body > table > tbody > tr > td > div > table >" +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody >" +
                            "tr > td:nth-child(1)");
            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.get(0).childNodes();
                    String theme = "Тема: " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0)
                            + "\n";
                    String data = "Дата: " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0)
                            + "\n\n";
                    System.out.print(theme);
                    System.out.print(data);
                    String themeDate = theme+data;
                    file.write(themeDate);
                }
            }


        } catch (IOException e) {
            System.out.println("Ошибка. Попытка переподключения к сайту");
        }
    }
}
