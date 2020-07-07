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
     * Complete the 'getMaxCharCount' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> getMaxCharCount(String s, List<List<Integer>> queries) {
    // queries is a n x 2 array where queries[i][0] and queries[i][1] represents x[i] and y[i] for the ith query.
        int count = 0, sum=0;
        List<Integer> a = new ArrayList<Integer>();
        int[] co = new int[36];
        for(int i = 0; i < 36 ; i++){
            co[i] = 0;
        }
        int temp1=0,temp2=0;
        System.out.println("Szie"+queries.size());
        for (int i = 0; i < queries.size(); i++) {
            System.out.println("Times "+ i);
            temp1=queries.get(i).get(0);
            temp2=queries.get(i).get(1);
            for (int j = temp1; j<=temp2 ; j++){
                co[Character.getNumericValue(s.charAt(j))] = co[Character.getNumericValue(s.charAt(j))] + 1;
                System.out.println("Times j - "+ j);
            }
            for(int k = 35 ; k>0; k--){
                System.out.println("Enter in K");
                if(co[k] !=0 ){
                    System.out.println("Enter in K's if");
                    a.add(co[k]);
                    System.out.println("Added - " + a.get(0) );
                    break;
                }
            }
            for(int l = 0; l < 36 ; l++){
                co[l] = 0;
            }
            /*
            for (int j = 0; j < 2; j++) { 
                //System.out.print(queries.get(i).get(j) + " ");
            } 
            System.out.println();*/ 
        } 
        return a;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> query = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                query.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = Result.getMaxCharCount(s, query);

        bufferedWriter.write(
            ans.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
