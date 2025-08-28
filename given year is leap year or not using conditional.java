import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        n=scan.nextInt();
        if(n%400==0){
            System.out.println("Leap year");
        }
        else if(n%100==0){
            System.out.print("Not a Leap year");
        }
        else if(n%4==0){
            System.out.print("Leap year");
        }
        else{
            System.out.print("Not a Leap year");
        }
    }
}
