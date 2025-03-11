import java.util.Scanner;

public class GST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n*** Goods and Services Tax calculator ***");
            System.out.print("-> Enter amount (or 0 for exit): ");
            double amount = scanner.nextDouble();
            if (amount == 0) {
                System.out.println("Exiting...");
                scanner.close();
                return;
            }
            System.out.print("-> Enter GST %: ");
            double gst = scanner.nextFloat();
            double finalPrice = amount + (amount * (gst / 100));
            System.out.printf("=> Final price = %.2f%n", finalPrice);
        }
    }
}