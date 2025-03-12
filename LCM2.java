import java.util.Scanner;

public class LCM2 {
    // Finding Greatest Common Divisor (GCD)
    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // Finding LCM by the formula: {(a*b) / GCD(a,b)}
    public static int lcm(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        scanner.close();
        System.out.println("LCM of " + first + " and " + second + " is: " + lcm(first, second));
    }
}