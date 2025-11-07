import java.util.Scanner;

public class DPTribonacciII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter tribonacci sequence number: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c = 1;

        int next = 0;

        for (int i = 3; i <= n; i++) {
            next = a + b + c;
            a = b;
            b = c;
            c = next;
        }

        System.out.println("-> Tribonacci number is: " + c);
        scanner.close();
    }
}
