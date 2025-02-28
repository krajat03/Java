import java.util.Scanner;

public class KeyStop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("-> Enter number: ");
            int num = s.nextInt();
            if (num < 0) {
                System.out.println("Exiting program...");
                break;
            }
        }
        s.close();
    }
}