import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

class SofaProblem {

    private static final int[][] MOVES = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    static class State {
        int x1, y1, x2, y2, steps;

        State(int x1, int y1, int x2, int y2, int steps) {
            if (x1 > x2 || (x1 == x2 && y1 > y2)) {
                int tx = x1, ty = y1;
                x1 = x2; y1 = y2;
                x2 = tx; y2 = ty;
            }
            this.x1 = x1; this.y1 = y1;
            this.x2 = x2; this.y2 = y2;
            this.steps = steps;
        }

        String key() {
            return x1 + "," + y1 + "," + x2 + "," + y2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.nextLine();

        char[][] grid = new char[M][N];
        int sx1=-1, sy1=-1, sx2=-1, sy2=-1;
        int ex1=-1, ey1=-1, ex2=-1, ey2=-1;

        for (int i = 0; i < M; i++) {
            String line = scanner.nextLine().replaceAll(" ", "");
            grid[i] = line.toCharArray();
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 's') {
                    if (sx1 == -1) { sx1=i; sy1=j; } else { sx2=i; sy2=j; }
                } else if (grid[i][j] == 'S') {
                    if (ex1 == -1) { ex1=i; ey1=j; } else { ex2=i; ey2=j; }
                }
            }
        }

        int ans = bfs(grid, M, N, sx1, sy1, sx2, sy2, ex1, ey1, ex2, ey2);
        System.out.println(ans == Integer.MAX_VALUE ? "Impossible" : ans);

        scanner.close();
    }

    private static int bfs(char[][] grid, int M, int N,
                           int sx1, int sy1, int sx2, int sy2,
                           int ex1, int ey1, int ex2, int ey2) {

        Queue<State> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        State start = new State(sx1, sy1, sx2, sy2, 0);
        q.add(start);
        visited.add(start.key());

        while (!q.isEmpty()) {
            State cur = q.poll();

            if ((cur.x1 == ex1 && cur.y1 == ey1 && cur.x2 == ex2 && cur.y2 == ey2) ||
                (cur.x1 == ex2 && cur.y1 == ey2 && cur.x2 == ex1 && cur.y2 == ey1)) {
                return cur.steps;
            }

            for (int[] mv : MOVES) {
                int nx1 = cur.x1 + mv[0], ny1 = cur.y1 + mv[1];
                int nx2 = cur.x2 + mv[0], ny2 = cur.y2 + mv[1];
                if (valid(grid, M, N, nx1, ny1) && valid(grid, M, N, nx2, ny2)) {
                    State next = new State(nx1, ny1, nx2, ny2, cur.steps + 1);
                    if (visited.add(next.key())) q.add(next);
                }
            }

            if (cur.x1 == cur.x2) { 
                int x = cur.x1, y = Math.min(cur.y1, cur.y2);
                if (freeSquare(grid, M, N, x, y)) {
                    State next1 = new State(x, y, x+1, y, cur.steps+1);
                    if (visited.add(next1.key())) q.add(next1);
                    State next2 = new State(x, y+1, x+1, y+1, cur.steps+1);
                    if (visited.add(next2.key())) q.add(next2);
                }
            } else if (cur.y1 == cur.y2) { 
                int x = Math.min(cur.x1, cur.x2), y = cur.y1;
                if (freeSquare(grid, M, N, x, y)) {
                    State next1 = new State(x, y, x, y+1, cur.steps+1);
                    if (visited.add(next1.key())) q.add(next1);
                    State next2 = new State(x+1, y, x+1, y+1, cur.steps+1);
                    if (visited.add(next2.key())) q.add(next2);
                }
            }
        }

        return Integer.MAX_VALUE;
    }

    private static boolean freeSquare(char[][] grid, int M, int N, int x, int y) {
        return x+1 < M && y+1 < N &&
               grid[x][y] != 'H' && grid[x+1][y] != 'H' &&
               grid[x][y+1] != 'H' && grid[x+1][y+1] != 'H';
    }

    private static boolean valid(char[][] grid, int M, int N, int x, int y) {
        return x >= 0 && x < M && y >= 0 && y < N && grid[x][y] != 'H';
    }
}
