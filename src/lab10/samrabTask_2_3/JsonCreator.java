package lab10.samrabTask_2_3;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonCreator {
    public static void main(String[] args) {
        JSONObject productsList = new JSONObject();
        JSONArray products = new JSONArray();

        JSONObject product1 = new JSONObject();
        product1.put("name","Молоко");
        product1.put("type","1 л.");
        product1.put("quantity","3 шт.");

        JSONObject product2 = new JSONObject();
        product2.put("name","Яблоки");
        product2.put("type","1 кг.");
        product2.put("quantity","1 шт.");

        products.add(product1);
        products.add(product2);

        productsList.put("products", products);

        try (FileWriter file = new FileWriter("src/lab10/samrabTask_2_3/product-json.json")) {
            file.write(productsList.toJSONString());
            System.out.println("Json-файл успешно создан");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
