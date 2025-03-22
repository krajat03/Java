import java.util.HashSet;
import java.util.Scanner;

public class Happy_Number2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower number: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper number: ");
        int upper = scanner.nextInt();
        scanner.close();

        System.out.println("Happy Numbers in the range:");
        for (int i = lower; i <= upper; i++) {
            if (isHappyNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isHappyNumber(int num) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        while (num != 1 && !seenNumbers.contains(num)) {
            seenNumbers.add(num);
            num = sumOfSquares(num);
        }
        return num == 1;
    }

    private static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit; // Square of the digit
            num /= 10;
        }
        return sum;
    }
}
