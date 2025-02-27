import java.util.*;

public class Prime_number {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        // Edge Case
        if (num <= 1) {
            System.out.println("-> It is not a prime number");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {     // Using an optimize loop
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("-> It is a prime number");
        else
            System.out.println("-> It is not a prime number");
    }
}