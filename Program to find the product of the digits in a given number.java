import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int num =scan.nextInt();
        int product=1;
        while (num>0) {
            int digit=num%10;
            product*=digit;
            num/=10;
        }

        System.out.println(product);
        
    }
}
