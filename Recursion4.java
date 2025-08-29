import java.util.Scanner;

public class Recursion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("-> " + fact(n));

        scanner.close();
    }

    static int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }
}
