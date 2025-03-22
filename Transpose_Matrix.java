import java.util.Scanner;

public class Transpose_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n-> Enter rows of Matrix: ");
        int row = scanner.nextInt();
        System.out.print("-> Enter columns of Matrix: ");
        int col = scanner.nextInt();

        int[][] matrix = new int[row][col];
        int[][] transpose = new int[col][row];

        System.out.println("\n-> Enter elements of Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        // Perform Transpose of Matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("\n************* Output *************");
        System.out.println("-> Matrix: ");
        printMatrix(matrix);

        System.out.println("\n-> Transpose of Matrix: ");
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix){
        for (int[] row : matrix) {
            System.out.print("[ ");
            for (int num : row) {
                System.out.print(num + " ");
                
            }
            System.out.println("]");

        }
    }
}