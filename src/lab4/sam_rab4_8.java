package lab4;
import java.util.Scanner;

public class sam_rab4_8 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String text = id.nextLine();
        System.out.print("Введите ключ: ");
        int shift = id.nextInt();

        String encryptStr = getEncryptString(text, shift);
        System.out.print("Текст после преобразования: " + "\"" + encryptStr + "\"");
        System.out.print("\nВыполнить обратное преобразование? (y/n): ");

        boolean cool = false;
        while (!cool) {
            String reply = id.next();
            if (reply.toLowerCase().equals("y")) {
                String decryptStr = getDecryptString(encryptStr, shift);
                System.out.println(decryptStr);
                cool = true;
            }
            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                cool = true;
            }
            else {
                System.out.println("Введите корректный ответ: ");
                cool = false;
            }
        }
    }

    public static String getEncryptString(String encryptText, int shift) {
        char[] ArrayText = encryptText.toCharArray();
        int[] CharCode = new int[ArrayText.length];
        for (int i = 0; i < ArrayText.length; i++)
        {
            CharCode[i] = ArrayText[i];
            CharCode[i] = CharCode[i] + shift;
        }
        for (int i = 0; i < ArrayText.length; i++)
        {
            ArrayText[i] = (char) CharCode[i];
        }
        encryptText = new String(ArrayText);
        return encryptText;
    }

    public static String getDecryptString(String encryptText, int shift) {
        char[] ArrayText = encryptText.toCharArray();
        int[] CharCode = new int[ArrayText.length];
        for (int i = 0; i < ArrayText.length; i++)
        {
            CharCode[i] = ArrayText[i];
            CharCode[i] = CharCode[i] - shift;
        }
        for (int i = 0; i < ArrayText.length; i++)
        {
            ArrayText[i] = (char) CharCode[i];
        }
        encryptText = new String(ArrayText);
        return encryptText;
    }
}
