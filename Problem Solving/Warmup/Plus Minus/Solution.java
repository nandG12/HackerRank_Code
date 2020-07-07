import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int i=0,sp=0,sn=0,sz=0;
        int len = arr.length;
        while(i<len){
            if(arr[i]==0) sz += 1;
            else if(arr[i]>0) sp += 1;
            else sn += 1;
            i++;
        }
        float sumPos = (float)sp/len ;
        float sumNeg = (float)sn/len ;
        float sumZero = (float)sz/len ;
        
        System.out.println(sumPos + "\n" + sumNeg + "\n" + sumZero);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
