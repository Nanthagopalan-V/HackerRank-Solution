import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a;
        a=scan.nextInt();
        if(a>=0){
            System.out.print("+"+a);
        }
        else{
            System.out.print(a);
        }
    }
}
