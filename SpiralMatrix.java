import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter the number of rows: ");
        int row = scanner.nextInt();

        System.out.print("-> Enter the number of columns: ");
        int col = scanner.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("-> Enter element: ");
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        ArrayList<Integer> ans = new ArrayList<>(spiralMatrix(matrix));

        System.out.println("Spiral order: " + ans);
        scanner.close();
    }

    static List<Integer> spiralMatrix(int[][] matrix) {
        int m = matrix.length; // row
        int n = matrix[0].length; // col

        int srow = 0, erow = m - 1, scol = 0, ecol = n - 1;

        ArrayList<Integer> ans = new ArrayList<>();

        while (srow <= erow && scol <= ecol) {
            // top
            for (int i = scol; i <= ecol; i++) {
                ans.add(matrix[srow][i]);
            }

            // right
            for (int i = srow + 1; i <= erow; i++) {
                ans.add(matrix[i][ecol]);
            }

            // bottom
            for (int i = ecol - 1; i >= scol; i--) {
                if (srow == erow) {
                    break;
                }
                ans.add(matrix[erow][i]);
            }

            // left
            for (int i = erow - 1; i >= srow + 1; i--) {
                if (scol == ecol) {
                    break;
                }
                ans.add(matrix[i][scol]);
            }

            srow++;
            erow--;
            scol++;
            ecol--;
        }
        return ans;
    }
}
