import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int i;
        long sum=0;
        long fmax,fmin;
        fmin = arr[0];
        fmax = arr[4];
        for(i=0;i<5;i++){
            if(fmin > arr[i]){
                fmin = arr[i];
            }
            if(fmax < arr[i]){
                fmax = arr[i];
            }
        }
        i = 0;
        while(i<5){
            sum = sum + arr[i];
            i++;
        }
        long max,min;
        max = sum - fmin;
        min = sum - fmax;
        System.out.println(min + " " + max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
