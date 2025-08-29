import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < b; i++) {
            result = result + a;
        }
        System.out.println(result);
        scanner.close();
    }
}
