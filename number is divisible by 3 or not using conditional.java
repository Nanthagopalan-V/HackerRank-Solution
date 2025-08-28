import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num%3==0){
            System.out.println("The number is divisible by 3");
        }else{
            int remainder = num%3;
            System.out.println("The number is not divisible by 3 and gives a remainder " + remainder);
        }
    }
}
