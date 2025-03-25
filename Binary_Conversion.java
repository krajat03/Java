import java.util.Scanner;

public class Binary_Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter number: ");
        int num = scanner.nextInt();
        scanner.close();
        StringBuilder binary = new StringBuilder();
        int mask = num;

        if (mask == 0) {
            binary.append("0");
        } else {
            while (mask > 0) {
                int digit = mask & 1;
                binary.insert(0, digit);
                mask >>= 1;
            }
        }
        
        System.out.println("=> Binary of " + num + " is: " + binary);
    }
}