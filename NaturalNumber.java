import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        scanner.close();
        System.out.println("Natural numbers till " + limit + " are: ");
        for (int i = 1; i < limit + 1; i++) {
            System.out.println("-> " + i);
        }
    }
}