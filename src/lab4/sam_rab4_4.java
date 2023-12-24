package lab4;

public class sam_rab4_4 {
    public static void main(String[] args) {
        int figure = 10;

        char[][] twoDimArray = new char[figure][figure];
        int i;
        int j=0;
        int z=0;

        for(i=0;i<twoDimArray.length;i++) {
            for(j=0;j<twoDimArray.length-z;j++) {
                twoDimArray[i][j]='*';
            }
            z++;
        }
        for(i=0;i<twoDimArray.length;i++) {
            for(j=0;j<twoDimArray.length;j++) {
                if(twoDimArray[i][j]!='*') {
                    twoDimArray[i][j] = ' ';
                }
            }
        }
        for(i=0;i<twoDimArray.length;i++) {
            for(j=0;j<twoDimArray.length;j++) {
                System.out.print(twoDimArray[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
