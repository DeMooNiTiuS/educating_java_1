package lab4;

public class sam_rab4_2 {
    public static void main(String[] args) {
        int figure = 10;
        int i;
        int j=9;
        int z=1;

        System.out.println("Прямоугольный треугольник с катетами размером 10: ");
        for(i=1;i<=figure;i++) {
            while (j<figure) {
                System.out.print("*\t");
                j++;
            }
            z+=1;
            j=j-z;
            System.out.println("");
        }
    }
}
