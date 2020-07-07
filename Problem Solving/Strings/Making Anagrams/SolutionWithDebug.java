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
        //char ch = 'e';
        int[] co1 = new int[36];
        int[] co2 = new int[36];
        for(int i = 0; i < 36 ; i++){
            co1[i] = 0;
            co2[i] = 0;
        }
        //co1[Character.getNumericValue((s1.charAt(2)))] = 4;
        //System.out.println("This is one" + Character.getNumericValue(s1.charAt(2)));
        //System.out.println("This is" + co1[Character.getNumericValue(s1.charAt(2))]);
        //System.out.println("This is" + Character.getNumericValue(ch));
        for(int i=0;i<s1.length();i++){
            co1[Character.getNumericValue(s1.charAt(i))] = co1[Character.getNumericValue(s1.charAt(i))] + 1;
        }
        for(int i=0;i<s2.length();i++){
            co2[Character.getNumericValue(s2.charAt(i))] = co2[Character.getNumericValue(s2.charAt(i))] + 1;
        }
        //System.out.println("for c1 "+ (co1[14]));
        //System.out.println("for c2 "+ (co2[14]));
        for(int i=10;i<36;i++){
            sum = sum + co1[i] + co2[i];
            //System.out.println("for sum "+sum);
            if(co1[i]!=0 && co2[i] !=0){
                //System.out.println("!st if" + count);
                if(co1[i] <= co2 [i]){
                    count = count + co1[i];
                    //System.out.println("2st if" + count);
                }
                else if(co1[i] > co2[i]){
                    count = count + co2[i];
                    //System.out.println("3st if" + count);
                }
            }
        }
        //System.out.println("final " + count + " Sum " + sum);
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
