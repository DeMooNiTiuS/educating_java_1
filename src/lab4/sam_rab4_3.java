package lab4;

public class sam_rab4_3 {
    public static void main(String[] args) {
        int figure = 10;

        int[][] twoDimArray = new int[figure][figure+5];
        int i;
        int j;
        int z;

        for(i=0;i<twoDimArray.length;i++) {
            for(j=0;j<twoDimArray.length+5;j++) {
                twoDimArray[i][j]=2;
            }
        }
        for(i=0;i<twoDimArray.length;i++) {
            for(j=0;j<twoDimArray.length+5;j++) {
                System.out.print(twoDimArray[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
