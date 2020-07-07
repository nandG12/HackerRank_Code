import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //Email_id Match Content String pattern
        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);

        //Initialize the ArrayList
        ArrayList<String> list = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            //Match with the regular Expression if matched, it store into matcher and then it will add its firstname.
            Matcher matcher = pattern.matcher(emailID);

            if (matcher.find())
                list.add(firstName);
        }

        //Sorting and Print the List
        Collections.sort(list);
        for(String item : list){
            System.out.println(item);
        }

        scanner.close();
    }
}
