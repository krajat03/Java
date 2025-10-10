import java.util.Arrays;
import java.util.Scanner;

public class DPFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(fib(n, dp));

        scanner.close();
    }

    static int fib(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }
}
