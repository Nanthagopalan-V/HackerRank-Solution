import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] parts = input.split("/");
        if (parts.length != 3) {
            System.out.println("Invalid");
            return;
        }
        try {
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);
            if (year<1900 || year>9999){
                System.out.println("Invalid");
                return;
            }
            if (month<1 || month>12) {
                System.out.println("Invalid");
                return;
            }
            int[] daysIn = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
            };
            if (month==2 && isLeapYear(year)) {
                daysIn[1] = 29;
            }
            if (day < 1 || day > daysIn[month - 1]) {
                System.out.println("Invalid");
            } else {
                System.out.println("Valid");
            }
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
