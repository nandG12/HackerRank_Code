import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maxScore' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER m
     */

    public static int maxScore(List<Integer> a, int m) {
    // Write your code here
        int[] arr = new int[a.size()];
        for(int i =0;i<a.size();i++){
            arr[i] = a.get(i);
        }
        Arrays.sort(arr);
        int mod = arr.length % m;
        System.out.println("mod is " + mod);
        int arrsize = arr.length / m;
        System.out.println("arrsize is " + arrsize);
        int lastArr = mod + m;
        System.out.println("lastArr is " + lastArr);
        int[] tempArr = new int[(arrsize+1)];
        int count=1,sum=0,mul=1,first=0;
        int i=0,temp=0;
        while(i<arr.length){
            sum = 0;
            if(count == arrsize){
                for(int j =0; j<lastArr; j++){
                    sum = sum + arr[i];
                    i++;
                }
                System.out.println("sum is at last " + sum);
                tempArr[temp] = sum;
                temp++;
                continue;
            }
            else{
                for(int j =0; j<m; j++){
                    sum = sum + arr[i];
                    i++;
                }
                System.out.println("sum is " + sum);
                tempArr[temp] = sum;
                temp++;
                count++;
            }
        }
        int finalsum = 0;
        for(int k =0;k<tempArr.length;k++){
            finalsum = finalsum + (tempArr[k] * (k+1)); 
        }
        return finalsum;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int ans = Result.maxScore(a, m);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
