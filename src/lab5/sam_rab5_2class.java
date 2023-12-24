package lab5;

public class sam_rab5_2class {
    private char firstSym;
    private char secondSym;
    public void SetCh(char firstSym, char secondSym) {
        this.firstSym = firstSym;
        this.secondSym = secondSym;
    }
    public void showCharArray() {
        int int1 = firstSym;
        int int2 = secondSym;
        if (firstSym > secondSym) {
            int1 = secondSym;
            int2 = firstSym;
        }
        int schet = 1;
        for (int i = int1; i <= int2; i++) {
            System.out.println(schet + " symbol = " + (char) i);
            schet++;
        }
    }
}
