import java.util.Scanner;
import java.util.Vector;

public class PascalTriangle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();
        if (rows <= 0) {
            System.out.println("-> Please enter a positive number of rows.");
            return;
        }

        Vector<Vector<Integer>> answer = new Vector<>();
        for (int i = 0; i < rows; i++) {
            answer.add(generateRow(i + 1));
        }
        printVector(answer);
    }

    public static Vector<Integer> generateRow(int row) {
        Vector<Integer> ans = new Vector<>();
        ans.add(1);
        int result = 1;
        for (int col = 1; col < row; col++) {
            result = result * (row - col) / col;
            ans.add(result);
        }
        return ans;
    }

    public static void printVector(Vector<Vector<Integer>> ans) {
        for (Vector<Integer> row : ans) {
            {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}
