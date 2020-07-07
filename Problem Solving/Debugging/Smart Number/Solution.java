//The change is on line 12 : "|| (val * val == num)" : We also need to check for big numbers. suppose 169 has three roots 169,13,1. So it have odd roots so it should reutn true.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean isSmartNumber(int num) {
        int val = (int) Math.sqrt(num);    
        if((num / val == 1) || (val * val == num))
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        int test_cases;
        Scanner in = new Scanner(System.in);
        test_cases = in.nextInt();
        int num;
        for(int i = 0; i < test_cases; i++){
            num = in.nextInt();
            boolean ans = isSmartNumber(num);
            if(ans){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
