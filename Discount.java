import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n********* Discount Calculator *********");
            System.out.print("-> Enter amount (or 0 for exit): ");
            double amount = scanner.nextDouble();
            if (amount == 0) {
                System.out.println("              Exiting...");
                scanner.close();
                return;
            }
            System.out.print("-> Enter discount %: ");
            double discount = scanner.nextDouble();
            double finalPrice = amount - (amount * (discount / 100));
            System.out.printf("=> Final price = %.2f%n", finalPrice);
        }

    }
}
