import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows of matrix1: ");
        int row1 = scanner.nextInt();
        System.out.print("Enter columns of matrix1: ");
        int columns1 = scanner.nextInt();

        System.out.print("Enter rows of matrix2: ");
        int row2 = scanner.nextInt();
        System.out.print("Enter columns of matrix2: ");
        int columns2 = scanner.nextInt();

        if (columns1 != row2) {
            System.out.println("Matrix multiplication not be possible!");
            scanner.close();
        } else {
            int[][] matrix1 = new int[row1][columns1];
            int[][] matrix2 = new int[row2][columns2];

            System.out.println("Enter elements of matrix1: ");
            matrixInput(matrix1, row1, columns1, scanner);
            System.out.println("Enter elements of matrix2: ");
            matrixInput(matrix2, row2, columns2, scanner);

            System.out.println("Matrix1 is: \n-> ");
            printMatrix(matrix1, row1, columns1);

            System.out.println("Matrix2 is: \n-> ");
            printMatrix(matrix2, row2, columns2);
            System.out.println();

            System.out.println("Matrix1 x Matrix2:- ");
            int[][] result = new int[row1][columns2];
            result = matrixMultiplication(matrix1, matrix2, row1, columns1, columns2);
            printMatrix(result, row1, columns2);
            scanner.close();
        }
    }

    public static int[][] matrixInput(int[][] matrix, int row, int col, Scanner scanner) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("-> Enter element ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2, int row1, int columns1, int columns2) {
        int result[][] = new int[row1][columns2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < columns2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
}
