import java.util.ArrayList;
import java.util.Scanner;

public class GraphDFS {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }

    }

    public static void createGraph(ArrayList<Edge> graph[], Scanner scanner, int edge) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edge; i++) {
            System.out.print("\n-> Enter source: ");
            int src = scanner.nextInt();

            System.out.print("-> Enter destination: ");
            int dest = scanner.nextInt();

            graph[src].add(new Edge(src, dest));

        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] visited) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (visited[e.dest] == false) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n-> Enter the number of vertices: ");
        int vertices = scanner.nextInt();

        System.out.print("-> Enter the number of edges: ");
        int edge = scanner.nextInt();

        ArrayList<Edge> graph[] = new ArrayList[vertices];

        boolean[] visited = new boolean[vertices];

        createGraph(graph, scanner, edge);

        dfs(graph, 0, visited);

        System.out.println();
    }
}
