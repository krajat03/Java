import java.util.Scanner;

public class Happy_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();
        if (isHappynumber(num))
            System.out.println("-> It is a Happy Number");
        else
            System.out.println("-> It is not a Happy Number");
    }

    public static boolean isHappynumber(int num) {
        while (num != 1) {
            int digit = num % 10;
            num += Math.sqrt(digit);
            num /= 10;
        }
        if (num == 1) {
            return true;
        }
        return false;
    }
}