package timus15;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int numOfTasks = in.nextInt();

        int diff = 12 - numOfTasks;

        int time = diff * 45;

        String result = time <= 240 ? "YES" : "NO";
//        if(time <= 240) {
//            out.println("YES");
//        } else {
//            out.println("NO");
//        }
        out.println(result);
        out.flush();
    }
}
