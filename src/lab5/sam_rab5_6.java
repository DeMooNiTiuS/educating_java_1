package lab5;

public class sam_rab5_6 {
    public static void main(String[] args) {
        //конструктор с 2-я аргументами
        sam_rab5_6class exampleToTask = new sam_rab5_6class(2, 5);
        exampleToTask.PrintInt();
        //конструктор с 1-м аргументом
        sam_rab5_6class exampleToTask1= new sam_rab5_6class(1);
        exampleToTask1.PrintInt();
        //метод с 2-я аргументами
        exampleToTask.SetNum(3, 15);
        exampleToTask.PrintInt();
        //метод с 1-м аргументом
        exampleToTask.SetNum(-9);
        exampleToTask.PrintInt();
    }
}
