import java.util.Arrays;
import java.util.Scanner;

public class DPTribonacciIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter number: ");
        int n = scanner.nextInt();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        tribonacciIII(n, dp);

        for (int i = 0; i <= n; i++) {
            System.out.println("T" + i + " = " + dp[i]);
        }
        scanner.close();
    }

    static int tribonacciIII(int n, int[] dp) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = tribonacciIII(n - 1, dp) + tribonacciIII(n - 2, dp) + tribonacciIII(n - 3, dp);

        return dp[n];
    }
}
