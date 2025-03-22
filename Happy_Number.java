import java.util.HashSet;
import java.util.Scanner;

public class Happy_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        if (isHappyNumber(num))
            System.out.println("-> It is a Happy Number");
        else
            System.out.println("-> It is not a Happy Number");
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
