import java.util.Scanner;

public class FactTrailingZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter number: ");
        int num = scanner.nextInt();
        int ans = trailingZeros(num);
        System.out.println("-> " + ans);
        scanner.close();
    }

    static int trailingZeros(int num) {
        int count = 0;
        while (num >= 5) {
            num /= 5;
            count += num;
        }
        return count;
    }
}
