package lab6;

public class sam_rab6_1 {
    public static void main(String[] args) {
        sam_rab6_1class sam_rab6 = new sam_rab6_1class();

        sam_rab6.setsymbol1Ormessage1('Q');
        sam_rab6.setsymbol1Ormessage1("Help");

        System.out.println(sam_rab6.symbol1);
        System.out.println(sam_rab6.message1);

        char[] chars1 = new char[5];
        chars1[0]='g';
        chars1[1]='k';
        chars1[2]='q';
        chars1[3]='f';
        chars1[4]='n';
        sam_rab6.setsymbol1Ormessage1(chars1);
        System.out.println(sam_rab6.message1);

        char[] chars2 = new char[1];
        chars2[0]='P';
        sam_rab6.setsymbol1Ormessage1(chars2);
        System.out.println(sam_rab6.symbol1);
    }
}
