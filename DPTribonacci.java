import java.util.Arrays;
import java.util.Scanner;

public class DPTribonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter tribonacci sequence number: ");
        int n = scanner.nextInt();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        int ans = tribonacci(n, dp);
        System.out.println("-> Tribonacci number is: " + ans);

        scanner.close();
    }

    static int tribonacci(int n, int[] dp) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = tribonacci(n - 1, dp) + tribonacci(n - 2, dp) + tribonacci(n - 3, dp);

        return dp[n];
    }
}
