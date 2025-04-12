import java.util.Scanner;
public class PascalTriangle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row index(r): ");
        int row = scanner.nextInt();
        scanner.close();

        int result[] = new int[row + 1];

        int ans = 1;
        result[0] = ans;
        for (int i = 1; i <= row; i++) {
            ans = ans * (row - i + 1);
            ans = ans / i;
            result[i] = ans;

        }
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
