package lab10.samrabEx5;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException {
        //
        String filePath = "src/lab10/samrabEx5/example5.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        //
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        //
        XSSFSheet sheet = workbook.getSheet("Товары");

        //
        for (Row row : sheet) {
            for (Cell cell : row) {
                //
                System.out.println(cell.toString() + "\t");
            }
            System.out.println();
        }

        workbook.close();
        inputStream.close();
    }
}
