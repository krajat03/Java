import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("-> Binary of " + number + " is: " + Integer.toBinaryString(number));
        System.out.println("-> Octal of " + number + " is: " + Integer.toOctalString(number));
        System.out.println("-> Hexadecimal of " + number + " is: " + Integer.toHexString(number).toUpperCase());
    }
}
