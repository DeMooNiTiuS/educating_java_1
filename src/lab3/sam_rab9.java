package lab3;
import java.util.*;

public class sam_rab9 {
    public static void main(String[] args) {
        Random VBR = new Random();
        Scanner id = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int size = id.nextInt();
        int minimal = 100;
        int[] numArray = new int[size];

        for (int i = 0; i < numArray.length; i++){
            numArray[i] = VBR.nextInt(100) + 1;
            if(numArray[i] < minimal){
                minimal = numArray[i];
            }
            System.out.print(numArray[i] + " ");
        }
        for (int j = 0; j < numArray.length; j++){
            if(numArray[j] < minimal){
                minimal = numArray[j];
            }
        }
        System.out.println();
        System.out.println("Минимальный элемент массива " + minimal);

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < numArray.length; i++){
            if(numArray[i] == minimal){
                list.add(i);
            }
        }
        if(list.size() == 1){
            for (int kl = 0; kl < list.size(); kl++){
                System.out.print("Посиция: " + list.get(kl));
            }
        }
        else {
            System.out.print("Позиция ");
            for (int kl = 0; kl < list.size(); kl++) {
                System.out.print(" | "+ list.get(kl) + " | ");
            }
        }
    }
}
