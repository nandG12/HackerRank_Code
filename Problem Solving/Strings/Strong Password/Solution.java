import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int count = 0,u=0,l=0,d=0,s=0;
        String specialCharacters="!@#$%^&*()-+";
        int len = password.length();
        char[] chart = password.toCharArray();
        for(int i =0;i<password.length();i++){
            if(Character.isDigit(chart[i])){
                d=1;
            }
            if(Character.isUpperCase(chart[i])){
                u=1;
            }
            if(Character.isLowerCase(chart[i])){
                l=1;
            }
            if(specialCharacters.contains(Character.toString(chart[i]))){
                s=1;
            }    
        }
        if(d==0){
            count++;
        }
        if(u==0){
            count++;
        }
        if(l==0){
            count++;
        }
        if(s==0){
            count++;
        }
        System.out.println("Coount - " + count);
        System.out.println("Len - " + len);
        if(len < 6){
            if(count == 1){
                System.out.println("Length one" + (len+count));
                if(len + count >= 6){
                    return count;
                }
                else{
                    return 6-len;
                }
            }
            if(count == 2){
                if(len + count >= 6){
                    return count;
                }
                else{
                    return 6-len;
                }
            }
            if(count == 3){
                if(len + count >= 6){
                    return count;
                }
                else{
                    return 6-len;
                }
            }
            return 6-len;
        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
