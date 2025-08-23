import java.util.Scanner;

public class MinAreaToCover1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter row: ");
        int row = scanner.nextInt();

        System.out.print("-> Enter col: ");
        int col = scanner.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter elements:- ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int ans = minAreaToCover1(arr);
        System.out.println("Ans: " + ans);
        
        scanner.close();
    }

    static int minAreaToCover1(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int minRow = m;
        int maxRow = -1;

        int minCol = n;
        int maxCol = -1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);

                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);

                }
            }
        }
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }
}
