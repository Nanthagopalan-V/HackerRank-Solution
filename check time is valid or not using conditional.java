import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String time=scan.next();
        String[] parts=time.split(":");
        int hh=Integer.parseInt(parts[0]);
        int mm=Integer.parseInt(parts[1]);
        int ss=Integer.parseInt(parts[2]);
        String[] result={"Not Valid","Valid"};
        int Valid=(hh>=0 && hh<=23 ?1:0)*(mm>=0 && mm<=59 ?1:0)*(ss>=0 && ss<=59 ?1:0);
        System.out.println(result[Valid]);
    }
}
