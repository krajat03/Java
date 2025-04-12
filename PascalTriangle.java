import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row(n): ");
        int n = scanner.nextInt();
        System.out.print("Enter position(r): ");
        int r = scanner.nextInt();
        scanner.close();

        long result;

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Invalid input! Ensure that 0 ≤ r ≤ n.");
            return;
        } else if (n == r) {
            result = 1;
        } else {
            result = nCr(n, r);
        }

        System.out.println("-> Element is: " + result);
    }

    public static long nCr(int n, int r) {
        n = n - 1;
        r = r - 1;
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}
