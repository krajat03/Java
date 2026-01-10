import java.util.Scanner;

public class Rotate_Image {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of square the matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter elements of matrix:- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix is:- ");
        printMat(matrix, n);

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(matrix, i, j);
            }
        }

        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }
        System.out.println("Rotated Matrix is:- ");
        printMat(matrix, n);
        scanner.close();
    }

    private static void swap(int[][] mat, int i, int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }

    private static void reverse(int[] mat){
        int p1 = 0, p2 = mat.length - 1;
        while (p1 < p2) {
            int temp = mat[p1];
            mat[p1] = mat[p2];
            mat[p2] = temp;
            p1++;
            p2--;
        }
    }

    private static void printMat(int[][] mat, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
