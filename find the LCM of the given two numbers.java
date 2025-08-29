import java.util.Scanner;

public class SimpleLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max = (a > b) ? a : b;
        int lcm = max;
        while (lcm % a != 0 || lcm % b != 0) {
            lcm++;
        }
        System.out.println(lcm);
        scanner.close();
    }
}
