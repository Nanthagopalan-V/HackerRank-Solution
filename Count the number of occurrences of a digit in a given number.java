import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int digit=scan.nextInt();
        int count=0;
        while (num>0) {
            if (num%10==digit) {
                count++;
            }
            num/= 10;
        }
        
        System.out.println(count);
    }
}
