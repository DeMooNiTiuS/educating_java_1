package lab4;

public class example4_1 {
    public static void main(String[] args) {
        int figure = 10;
        int i;
        int j;
        int z;

        for(i=1;i<=figure;i++) {
            System.out.print("номер строки: "+i+" ");
            z=0;
            for(j=-5;j<figure;j++) {
                System.out.print("+");
                z=z+1;
            }
            System.out.println(" Количетсво символов в строке "+z);
        }
    }
}
