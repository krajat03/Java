import java.util.Scanner;

public class DPFibonacciII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        int ans = fib(n);


        System.out.println("-> The " + n + " fibonacci number is: " + ans);

        scanner.close();
    }

    static int fib(int n) {
        int prev2 = 0;
        int prev = 1;

        for (int i = 2; i <= n; i++) {
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

}
