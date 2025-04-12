import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter r: ");
        int r = scanner.nextInt();
        scanner.close();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Invalid input! Ensure that 0 ≤ r ≤ n.");
            return;
        }

        long result = factorial(n) / (factorial(n - r) * factorial(r));
        System.out.println(n + "C" + r + " = " + result);
    }

    public static long factorial(int n) {
        int fact = 1;
        for (int i = n; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }
}
