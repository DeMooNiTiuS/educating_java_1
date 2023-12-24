package lab5;
public class sam_rab5_6class {
    private static int min;
    private static int max;
    static void SetNum(int num1, int num2) {
        System.out.println("Метод SetNum() c 2-я аргументами");
        min = Math.min(Math.min(num1, min),num2);
        max = Math.max(Math.max(num1, max),num2);
    }
    static void SetNum(int num) {
        System.out.println("Метод SetNum() c 1-м аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
    static void PrintInt() {
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
    sam_rab5_6class(int num1, int num2) {
        System.out.println("Конструктор sam_rab5_6class() c 2-я аргументами");
        min = Math.min(num1,num2);
        max = Math.max(num1,num2);
    }
    sam_rab5_6class(int num) {
        System.out.println("Конструктор sam_rab5_6class() c 1-м аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
}
