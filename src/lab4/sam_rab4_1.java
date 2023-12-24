package lab4;

public class sam_rab4_1 {
    public static void main(String[] args) {
        int figure = 11;
        int i;
        int j;
        int z;

        System.out.println("Прямоугольник размерами 23 на 11: ");
        for(i=1;i<=figure;i++) {
            z=0;
            for(j=-12;j<figure;j++) {
                System.out.print("+");
                z=z+1;
            }
            System.out.println("");
        }
    }
}
