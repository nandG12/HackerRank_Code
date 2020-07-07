import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        int count=0,n;
        String answer = "funny";
        int len = s.length();
        if(len%2 == 0){
            n = len / 2;
            n = n-1;
        }
        else{
            n = (len/2);
        }
        System.out.println("N is " + n);
        int i =0,j=len-1;
        while(i<n){
            if(Math.abs(s.charAt(i) - s.charAt(i+1)) == Math.abs(s.charAt(j) - s.charAt(j-1))){
                answer = "Funny";
            }
            else{
                answer = "Not Funny";
                break;
            }
            i++;
            j--;
        }
        return answer;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
