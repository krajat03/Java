import java.util.*;

public class Prime_Number_between {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter lower value: ");
        int l = s.nextInt();
        System.out.print("Enter upper value: ");
        int u = s.nextInt();
        s.close();
        if (l > u) {
            System.out.println("// Invalid range!");
            return;
        }
        boolean foundPrime = false;
        System.out.println("Prime numbers between " + l + " and " + u + " are: ");
        for (int i = l; i <= u; i++) {
            if (i < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                foundPrime = true;
            }
        }
        if (!foundPrime) {
            System.out.println("// No prime number exist in the given range");
        } else {
            System.out.println();
        }
    }
}