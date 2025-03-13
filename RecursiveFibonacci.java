import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (greater than 0): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a positive integer: ");
            scanner.next();
        }
        int nterms = scanner.nextInt();
        scanner.close();
        if (nterms <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            System.out.println("Fibonacci sequence:");
            for (int i = 0; i < nterms; i++) {
                System.out.println(i + 1 + ") " + recurFibo(i) + " ");
            }
        }
    }

    public static int recurFibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recurFibo(n - 1) + recurFibo(n - 2);
        }
    }
}
