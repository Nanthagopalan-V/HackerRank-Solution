import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        if (num>=1 && num<=12) {
            System.out.println(months[num - 1]);
        } else {
            System.out.println("Invalid");
        }
    }
}
