import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 1;
        do {
            System.out.print("-> Enter number: ");
            num = s.nextInt();
            if (num == 0) {
                System.out.println("Exiting program... ");
                break;
            }
        } while (true);
        s.close();
    }
}