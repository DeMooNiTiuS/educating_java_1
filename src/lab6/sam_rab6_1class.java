package lab6;

public class sam_rab6_1class {
    String message1;
    char symbol1;

    public void setsymbol1Ormessage1(char symbol1) {
        this.symbol1=symbol1;
    }
    public void setsymbol1Ormessage1(String message1) {
        this.message1=message1;
    }
    public void setsymbol1Ormessage1(char[] chars) {
        if(chars.length==1){
            this.symbol1=chars[0];
        } else if (chars.length>1) {
            this.message1=String.valueOf(chars);
        }
    }
}
