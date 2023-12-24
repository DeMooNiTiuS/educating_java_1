package lab5;
public class sam_rab5_3class {
    private int firstNum;
    private int secondNum;
    sam_rab5_3class() {
        System.out.println("Конструирование объекта sam_rab5_3class");
    }
    sam_rab5_3class(int firstNum) {
        System.out.println("Koнcтpyиpoвaниe объекта sam_rab5_3class(2)");
        this.firstNum = firstNum;
        System.out.println("num1*num1 = "+firstNum*firstNum);
    }
    sam_rab5_3class(int firstNum, int secondNum){
        System.out.println("Koнcтpyиpoвaниe объекта Example(3)");
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        System.out.println("num1*num2 = "+firstNum*secondNum);
    }
}
