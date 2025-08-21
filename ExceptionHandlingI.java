import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("-> Enter num1: ");
            int a = scanner.nextInt();

            System.out.print("-> Enter num2: ");
            int b = scanner.nextInt();

            int result = a / b;

            System.out.println("-> Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integer only!");
        } finally {
            scanner.close();
            System.out.println("Program finished.");
        }

    }
}