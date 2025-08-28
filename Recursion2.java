import java.util.Scanner;

public class Recursion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        print(1, n);

        scanner.close();
    }

    static void print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Hello");
        print(i + 1, n);
    }
}
