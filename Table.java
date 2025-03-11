import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }
        scanner.close();
    }
}
