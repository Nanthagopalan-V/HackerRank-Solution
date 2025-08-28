import java.util.Scanner;

public class DayFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] days = {
            "Sunday", "Monday", "Tuesday", "Wednesday", 
            "Thursday", "Friday", "Saturday"
        };
        if (num>=0 && num<=6) {
            System.out.println(days[num]);
        } else {
            System.out.println("Invalid");
        }
    }
}
