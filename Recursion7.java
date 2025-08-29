import java.util.Scanner;

public class Recursion7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter number: ");
        int num = scanner.nextInt();

        System.out.println(num + " fibonacci number is: " + fib(num));

        scanner.close();
    }

    static int fib(int num) {
        if (num <= 1) {
            return num;
        }

        int last = fib(num - 1);
        int slast = fib(num - 2);

        return last + slast;
    }
}
