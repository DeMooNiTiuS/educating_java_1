package lab10.samrabTask_2_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class CreateTaskXMLFile {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание корневого элемента
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("productList");
            doc.appendChild(rootElement);

            // Добавление первого продукта
            Element product1 = doc.createElement("product");
            rootElement.appendChild(product1);

            Element name1 = doc.createElement("name");
            name1.appendChild(doc.createTextNode("Молоко"));
            product1.appendChild(name1);

            Element type1 = doc.createElement("type");
            type1.appendChild(doc.createTextNode("1 л."));
            product1.appendChild(type1);

            Element quantity1 = doc.createElement("quantity");
            quantity1.appendChild(doc.createTextNode("3 шт."));
            product1.appendChild(quantity1);

            // Добавление второго продукта
            Element product2 = doc.createElement("product");
            rootElement.appendChild(product2);

            Element name2 = doc.createElement("name");
            name2.appendChild(doc.createTextNode("Яблоки"));
            product2.appendChild(name2);

            Element type2 = doc.createElement("type");
            type2.appendChild(doc.createTextNode("1 кг."));
            product2.appendChild(type2);

            Element quantity2 = doc.createElement("quantity");
            quantity2.appendChild(doc.createTextNode("1 шт."));
            product2.appendChild(quantity2);

            // Добавление третьего продукта
            Element product3 = doc.createElement("product");
            rootElement.appendChild(product3);

            Element name3 = doc.createElement("name");
            name3.appendChild(doc.createTextNode("Печенье"));
            product3.appendChild(name3);

            Element type3 = doc.createElement("type");
            type3.appendChild(doc.createTextNode("300 гр."));
            product3.appendChild(type3);

            Element quantity3 = doc.createElement("quantity");
            quantity3.appendChild(doc.createTextNode("2 шт."));
            product3.appendChild(quantity3);

            // Запись XML-файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty( javax.xml.transform.OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty( javax.xml.transform.OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File("src/lab10/samrabTask_2_1/Product.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан");

        } catch (Exception pce) {
            pce.printStackTrace();
        }
    }
}
