import java.util.Scanner;

public class LCM {
    public static int computeLCM(int x, int y) {
        int greater = Math.max(x, y);
        while (true) {
            if (greater % x == 0 && greater % y == 0) {
                return greater;
            } else
                greater++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        scanner.close();
        System.out.println("LCM of " + first + ", " + second + " = " + computeLCM(first, second));
    }
}
