import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int a,i,flag=0,p=2;
        a=scan.nextInt();
        while(a>=p){
            if(a==p){
                flag=1;
            }
            p=p*2;
        }
        if(flag==1){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
        
        
    }
}
