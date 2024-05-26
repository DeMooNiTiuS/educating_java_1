package lab9.samRab1;

import java.util.HashMap;
import java.util.Map;

public class demonstr4 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            hashMap.put(i, "Объект HashMap № " + i);
        }

        System.out.println("Строки с ключом > 5 :");
        for (Map.Entry<Integer,String> key : hashMap.entrySet()) {
            if (key.getKey() > 5) {
                System.out.println(key.getValue());
            }
        }

        if (hashMap.containsKey(0)) {
            System.out.println("Строки с нулевым ключом: " + hashMap.get(0));
        }

        int result = 1;
        for (Map.Entry<Integer, String> key : hashMap.entrySet()) {
            if (key.getValue().length() > 5) {
                result *= key.getKey();
            }
        }

        System.out.println("Произведение ключей с длиной строки больше 5: " + result);
    }
}
