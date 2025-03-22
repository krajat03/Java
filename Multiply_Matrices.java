import java.util.Scanner;
public class Multiply_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n-> Enter rows of Matrix1: ");
        int row1 = scanner.nextInt();
        System.out.print("-> Enter columns of Matrix1: ");
        int col1 = scanner.nextInt();

        System.out.print("\n-> Enter rows of Matrix2: ");
        int row2 = scanner.nextInt();
        System.out.print("-> Enter columns of Matrix2: ");  
        int col2 = scanner.nextInt();

        // Check if matrix multiplication is possible
        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible. \nThe number of columns in Matrix1 must match the number of rows in Matrix2.");
            scanner.close();
            return;
        }

        int[][] arr1 = new int[row1][col1];
        int[][] arr2 = new int[row2][col2];
        int[][] product = new int[row1][col2];

        System.out.println("\n-> Enter elements of Matrix1:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n-> Enter elements of Matrix2:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < row1; i++) { // Rows of Matrix1
            for (int j = 0; j < col2; j++) { // Columns of Matrix2
                for (int k = 0; k < col1; k++) { // Common dimension
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("\n************* Output *************");
        // Print Matrix 1
        System.out.println("Matrix 1:");
        printMatrix(arr1);

        // Print Matrix 2
        System.out.println("Matrix 2:");
        printMatrix(arr2);

        // Print multiply of Matrices
        System.out.println("Multiplication of Matrices:");
        printMatrix(product);

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