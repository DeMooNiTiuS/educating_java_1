package timus15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2100 {
    public static void main(String[] args) {

        String inputFileName = "src/timus15/input2100.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") !=null;

        int couple =2;

        try {

            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));

            String readLine = "";

            int numOfFriends = 0;
            int numOfCouples = 0;

            while ((readLine = bufferedReader.readLine()) != null) {
                if(numOfFriends == 0){
                    numOfFriends = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")){
                    numOfCouples++;
                }
            }

            int result;

            int guests = (couple + numOfFriends + numOfCouples);

            if(guests == 13){
                result = (guests * 100) + 100;
            } else {
                result = guests * 100;
            }

            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
