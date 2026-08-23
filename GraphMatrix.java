import java.util.Scanner;

public class GraphMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        int[][] graph = new int[v + 1][v + 1];

        for (int i = 0; i < e; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            graph[n][m] = 1;
            graph[m][n] = 1;
        }
        sc.close();
    }

}
