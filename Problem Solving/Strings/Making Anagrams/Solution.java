import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {
        int count = 0, sum=0;
        int[] co1 = new int[36];
        int[] co2 = new int[36];
        for(int i = 0; i < 36 ; i++){
            co1[i] = 0;
            co2[i] = 0;
        }
        for(int i=0;i<s1.length();i++){
            co1[Character.getNumericValue(s1.charAt(i))] = co1[Character.getNumericValue(s1.charAt(i))] + 1;
        }
        for(int i=0;i<s2.length();i++){
            co2[Character.getNumericValue(s2.charAt(i))] = co2[Character.getNumericValue(s2.charAt(i))] + 1;
        }
        for(int i=10;i<36;i++){
            sum = sum + co1[i] + co2[i];
            if(co1[i]!=0 && co2[i] !=0){
                if(co1[i] <= co2 [i]){
                    count = count + co1[i];
                }
                else if(co1[i] > co2[i]){
                    count = count + co2[i];
                }
            }
        }
        int answer = sum - (count * 2);
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
