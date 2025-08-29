import java.util.Scanner;

public class Recursion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("-> " + print(n));

        scanner.close();
    }

    static int print(int n) {
        if (n == 0) {
            return 0;
        }

        return n + print(n - 1);
    }
}
