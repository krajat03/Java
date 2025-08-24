import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter number: ");
        int num = scanner.nextInt();

        String[] result = { "-> Even", "-> Odd" };

        System.out.println(result[Math.abs(num % 2)]);

        scanner.close();
    }
}
