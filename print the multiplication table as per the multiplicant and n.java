import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int m = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " * " + m + " = " +i * m);
        }

        scanner.close();
    }
}
