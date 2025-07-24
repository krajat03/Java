import java.util.Scanner;

public class XraisetothepowerN2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter the value of x: ");
        double x = scanner.nextDouble();
        System.out.print("-> Enter the value of n: ");
        int n = scanner.nextInt();

        scanner.close();

        double ans = power(x, n);
        System.out.println("-> " + x + "^" + n + " = " + ans);

    }

    static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / power(x, -n);
        }

        double half = power(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }
}
