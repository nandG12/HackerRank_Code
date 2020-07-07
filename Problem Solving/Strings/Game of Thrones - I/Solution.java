import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        int count = 0, sum=0;
        int[] co = new int[36];
        for(int i = 0; i < 36 ; i++){
            co[i] = 0;
        }
        for(int i=0;i<s.length();i++){
            co[Character.getNumericValue(s.charAt(i))] = co[Character.getNumericValue(s.charAt(i))] + 1;
        }
        int secCount = 0, firCount = 0;
        String dici = "";
        for(int i=10;i<36;i++){
            if(co[i] % 2 == 0){
                dici = "YES";
            }
            if(co[i] % 2 != 0){
                secCount++;
            }
        }
        if(secCount == 1 || secCount == 0){
            return dici;
        }
        else
            return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
