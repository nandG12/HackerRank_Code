import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pangrams function below.
    static String pangrams(String s) {
        String answer = "pangram";
        String S = s.toLowerCase();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char[] match = alpha.toCharArray();
        for(int i=0;i<match.length;i++){
            if(!S.contains(Character.toString(match[i]))){
                answer = "not pangram";
                break;
            }
        }
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
