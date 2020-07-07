import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();

        int day1 = in.nextInt();
        int month1 = in.nextInt();
        int year1 = in.nextInt();

        int fine = 0;

        if (year > year1) fine = 10000;
        else if (year == year1) {
            if (month > month1) fine = (month - month1) * 500;
            else if (month == month1 && day > day1) fine = (day - day1) * 15;
        }

        System.out.println(fine);
    }
}
