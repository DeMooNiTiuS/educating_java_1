package timus;
import java.util.Scanner;

public class task_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int panelNum;
        int wNum;
        int lNum;

        int countPanel = 0;
        int countLength = 0;
        int countWidth = 0;

        //Проверка на соблюдение правил N (1 ≤ N ≤ 100), A (1 ≤ A ≤ 100), B (1 ≤ B ≤ 100)
        do {
            System.out.print("Введите число панелей: ");
            panelNum = in.nextInt();
            if (panelNum >= 1 && panelNum <= 100)
            {
                countPanel = 0;
            }
            else
                countPanel = countPanel + 1;

            System.out.print("Введите длину палени: ");
            lNum = in.nextInt();
            if (lNum >= 1 && lNum <= 100)
            {
                countLength = 0;
            }
            else
                countLength = countLength + 1;

            System.out.print("Введите ширину панели: ");
            wNum = in.nextInt();
            if (wNum >= 1 && wNum <= 100)
            {
                countWidth = 0;
            }
            else {
                countWidth = countWidth + 1;
            }
            if (countPanel!=0 || countLength!=0 || countWidth!=0)
            {
                var Msg="";
                var RepeatCountPanel = "число панелей;";
                var RepeatCountLength = "длина панелей;";
                var RepeatCountWidth = "ширина панелей;";

                if (countPanel!=0)
                    Msg=Msg+RepeatCountPanel;
                if (countLength!=0)
                    Msg=Msg+RepeatCountLength;
                if (countWidth!=0)
                    Msg=Msg+RepeatCountWidth;

                System.out.println("Повторите ввод данных. Ошибка в переменных: "+Msg);
                }
            }
            while (countPanel!=0 || countLength!=0 || countWidth!=0);

            int mass = (wNum*lNum)*2*panelNum;

            System.out.println("На обработку всех панелей «Энии» необходимо: "+mass+" нанограмм сульфида тория");
            in.close();
        }

}
