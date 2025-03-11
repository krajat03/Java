import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter number of terms: ");
        int fib = scanner.nextInt();
        if (fib <= 0) {
            System.out.println("Invalid number of terms");
        }
        System.out.println("-> Fibonacci series: ");
        if (fib >= 1) {
            System.out.println(num1);
        }
        if (fib >= 2) {

            System.out.println(num2);
        }
        int count = 2;
        while (count < fib) {
            count++;
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
            System.out.println(next);
        }
        scanner.close();
    }
}