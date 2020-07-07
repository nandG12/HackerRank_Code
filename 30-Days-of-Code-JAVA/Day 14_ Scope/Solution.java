import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    private int[] temp;
    int temp_max=0;
    
	  // Add your code here
    Difference(int[] elements){
        this.elements = elements;
    }
    void computeDifference(){
        for(int i=0;i<elements.length;i++){
            for(int j=i;j<elements.length;j++){
                if(temp_max<Math.abs(elements[i]-elements[j])){
                    temp_max = Math.abs(elements[i]-elements[j]);
                }
            }
        }
        maximumDifference = temp_max;
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
