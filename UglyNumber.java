import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isUgly(num)) {
            System.out.println("-> " + num + " is an Ugly number");
        } else {
            System.out.println("-> " + num + " is not an Ugly number");
        }
    }

    public static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }

        while (num % 2 == 0)
            num /= 2;
        while (num % 3 == 0)
            num /= 3;
        while (num % 5 == 0)
            num /= 5;

        return num == 1;
    }
}
