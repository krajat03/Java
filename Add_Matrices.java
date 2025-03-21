import java.util.Scanner;

public class Add_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter rows of Matrix1: ");
        int row1 = scanner.nextInt();
        System.out.print("-> Enter columns of Matrix1: ");
        int col1 = scanner.nextInt();

        System.out.print("-> Enter rows of Matrix2: ");
        int row2 = scanner.nextInt();
        System.out.print("-> Enter columns of Matrix2: ");
        int col2 = scanner.nextInt();

        // Check if matrix addition is possible
        if (row1 != row2 || col1 != col2) {
            System.out.println("Matrix addition is not possible. Both matrices must have the same dimensions.");
            scanner.close();
            return;
        }

        int[][] arr1 = new int[row1][col1];
        int[][] arr2 = new int[row2][col2];
        int[][] sum = new int[row1][col1];

        System.out.println("-> Enter elements of Matrix1:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("-> Enter elements of Matrix2:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix addition
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // Print Matrix 1
        System.out.println("\nMatrix 1:");
        printMatrix(arr1);

        // Print Matrix 2
        System.out.println("Matrix 2:");
        printMatrix(arr2);

        // Print Sum of Matrices
        System.out.println("\nSum of Matrices:");
        printMatrix(sum);

        scanner.close();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("[ ");
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    }
}
