package lab5;

public class sam_rab5_1class {
    private char SymbolFrom;
    public void SetSym(char char1) {
        this.SymbolFrom = char1;
    }
    public int getCodeSymbol() {
        return (int) SymbolFrom;
    }
    public void codeLook() {
        System.out.println("ch1 = " + SymbolFrom);
        System.out.println("ch1 = " + getCodeSymbol()+"\n");
    }
}
