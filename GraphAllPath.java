import java.util.ArrayList;
import java.util.Scanner;

public class GraphAllPath {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int edges, Scanner scanner) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edges; i++) {
            System.out.print("\n-> Enter source: ");
            int src = scanner.nextInt();

            System.out.print("-> Enter destination: ");
            int dest = scanner.nextInt();

            graph[src].add(new Edge(src, dest));
        }
    }

    public static void graphAllPath(ArrayList<Edge> graph[], boolean[] visited, int curr, String path, int tar) {
        if (curr == tar) {
            System.out.println(path);
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (visited[e.dest] == false) {
                visited[curr] = true;
                graphAllPath(graph, visited, e.dest, path + e.dest, tar);
                visited[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n-> Enter the number of vertices: ");
        int vertices = scanner.nextInt();

        System.out.print("-> Enter the number of edges: ");
        int edges = scanner.nextInt();

        ArrayList<Edge> graph[] = new ArrayList[vertices];
        boolean[] visited = new boolean[vertices];

        createGraph(graph, edges, scanner);

        String path = "0";

        System.out.print("\n-> Enter path source: ");
        int src = scanner.nextInt();

        System.out.print("-> Enter path destination: ");
        int dest = scanner.nextInt();

        System.out.println("\n-> All paths are:- ");
        graphAllPath(graph, visited, src, path, dest);
    }
}
