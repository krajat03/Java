import java.util.Scanner;

public class Swap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = scanner.nextInt();
        System.out.print("Enter num2: ");
        int b = scanner.nextInt();
        scanner.close();

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("-> Num1 = " + a + " Num2 = " + b);
    }
}
