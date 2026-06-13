import java.util.*;

public class SofaProblem {

    private static final int[][] MOVES = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    static class State {
        int x1, y1, x2, y2, steps;
        State(int x1, int y1, int x2, int y2, int steps) {
            this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2; this.steps = steps;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.print("Impossible");
            return;
        }
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        char[][] grid = new char[M][N];
        int sx1 = -1, sy1 = -1, sx2 = -1, sy2 = -1;
        int ex1 = -1, ey1 = -1, ex2 = -1, ey2 = -1;


        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!scanner.hasNext()) {
                    System.out.print("Impossible");
                    scanner.close();
                    return;
                }
                String tok = scanner.next();
                if (tok.length() == 0) { j--; continue; }
                char ch = tok.charAt(0);
                grid[i][j] = ch;
                if (ch == 's') {
                    if (sx1 == -1) { sx1 = i; sy1 = j; } else { sx2 = i; sy2 = j; }
                } else if (ch == 'S') {
                    if (ex1 == -1) { ex1 = i; ey1 = j; } else { ex2 = i; ey2 = j; }
                }
            }
        }
        scanner.close();


        if (sx1 == -1 || sx2 == -1 || ex1 == -1 || ex2 == -1) {
            System.out.print("Impossible");
            return;
        }

        if (!areAdjacent(sx1, sy1, sx2, sy2) || !areAdjacent(ex1, ey1, ex2, ey2)) {
            System.out.print("Impossible");
            return;
        }

        int result = bfs(grid, M, N, sx1, sy1, sx2, sy2, ex1, ey1, ex2, ey2);
        System.out.print(result == Integer.MAX_VALUE ? "Impossible" : result);
    }

    private static boolean areAdjacent(int x1, int y1, int x2, int y2) {
        return (x1 == x2 && Math.abs(y1 - y2) == 1) || (y1 == y2 && Math.abs(x1 - x2) == 1);
    }

    private static int bfs(char[][] grid, int M, int N,
                           int sx1, int sy1, int sx2, int sy2,
                           int ex1, int ey1, int ex2, int ey2) {

        Queue<State> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(new State(sx1, sy1, sx2, sy2, 0));
        visited.add(createKey(sx1, sy1, sx2, sy2));

        while (!q.isEmpty()) {
            State cur = q.poll();


            if ( (cur.x1 == ex1 && cur.y1 == ey1 && cur.x2 == ex2 && cur.y2 == ey2) ||
                 (cur.x1 == ex2 && cur.y1 == ey2 && cur.x2 == ex1 && cur.y2 == ey1) ) {
                return cur.steps;
            }


            for (int[] mv : MOVES) {
                int nx1 = cur.x1 + mv[0], ny1 = cur.y1 + mv[1];
                int nx2 = cur.x2 + mv[0], ny2 = cur.y2 + mv[1];
                if (isValidMove(grid, M, N, nx1, ny1, nx2, ny2)) {
                    String key = createKey(nx1, ny1, nx2, ny2);
                    if (!visited.contains(key)) {
                        visited.add(key);
                        q.add(new State(nx1, ny1, nx2, ny2, cur.steps + 1));
                    }
                }
            }


            List<State> rotations = getRotations(cur, grid, M, N);
            for (State r : rotations) {
                String key = createKey(r.x1, r.y1, r.x2, r.y2);
                if (!visited.contains(key)) {
                    visited.add(key);
                    q.add(new State(r.x1, r.y1, r.x2, r.y2, cur.steps + 1));
                }
            }
        }

        return Integer.MAX_VALUE;
    }

    private static boolean isValidMove(char[][] grid, int M, int N, int x1, int y1, int x2, int y2) {
        return inBounds(x1, y1, M, N) && grid[x1][y1] != 'H' &&
               inBounds(x2, y2, M, N) && grid[x2][y2] != 'H';
    }

    private static List<State> getRotations(State cur, char[][] grid, int M, int N) {
        int x1 = cur.x1, y1 = cur.y1, x2 = cur.x2, y2 = cur.y2;
        if (x1 > x2 || (x1 == x2 && y1 > y2)) {
            int tx = x1, ty = y1; x1 = x2; y1 = y2; x2 = tx; y2 = ty;
        }

        List<State> res = new ArrayList<>();


        if (x1 == x2) {
            int row = x1;
            int c1 = Math.min(y1, y2);

            if (row - 1 >= 0 && isFree2x2(grid, row - 1, c1, M, N)) {

                res.add(new State(row - 1, c1, row, c1, 0));

                res.add(new State(row - 1, c1 + 1, row, c1 + 1, 0));
            }

            if (row + 1 < M && isFree2x2(grid, row, c1, M, N)) {
                res.add(new State(row, c1, row + 1, c1, 0));
                res.add(new State(row, c1 + 1, row + 1, c1 + 1, 0));
            }
        }

        else if (y1 == y2) {
            int col = y1;
            int r1 = Math.min(x1, x2);

            if (col - 1 >= 0 && isFree2x2(grid, r1, col - 1, M, N)) {
                res.add(new State(r1, col - 1, r1, col, 0));
                res.add(new State(r1 + 1, col - 1, r1 + 1, col, 0));
            }

            if (col + 1 < N && isFree2x2(grid, r1, col, M, N)) {
                res.add(new State(r1, col, r1, col + 1, 0));
                res.add(new State(r1 + 1, col, r1 + 1, col + 1, 0));
            }
        }

        return res;
    }

    private static boolean isFree2x2(char[][] grid, int x, int y, int M, int N) {

        return inBounds(x, y, M, N) && grid[x][y] != 'H' &&
               inBounds(x + 1, y, M, N) && grid[x + 1][y] != 'H' &&
               inBounds(x, y + 1, M, N) && grid[x][y + 1] != 'H' &&
               inBounds(x + 1, y + 1, M, N) && grid[x + 1][y + 1] != 'H';
    }

    private static boolean inBounds(int x, int y, int M, int N) {
        return x >= 0 && x < M && y >= 0 && y < N;
    }

    private static String createKey(int x1, int y1, int x2, int y2) {
        if (x1 > x2 || (x1 == x2 && y1 > y2)) {
            int tx = x1, ty = y1; x1 = x2; y1 = y2; x2 = tx; y2 = ty;
        }
        return x1 + ":" + y1 + "-" + x2 + ":" + y2;
    }
}



