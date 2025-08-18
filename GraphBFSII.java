import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class GraphBFSII {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], Scanner scanner, int edges) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edges; i++) {
            System.out.print("-> Enter source: ");
            int src = scanner.nextInt();

            System.out.print("-> Enter destination: ");
            int dest = scanner.nextInt();

            graph[src].add(new Edge(src, dest));

            System.out.println();
        }
    }

    public static void bfs(ArrayList<Edge> graph[], boolean visited[], int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void printGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print(e.dest + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter vertices of graph: ");
        int vertices = scanner.nextInt();

        System.out.print("-> Enter edges of graph: ");
        int edges = scanner.nextInt();

        ArrayList<Edge> graph[] = new ArrayList[vertices];

        boolean visited[] = new boolean[graph.length];

        createGraph(graph, scanner, edges);

        System.out.println("\nBFS Traversal:- ");
        for (int i = 0; i < vertices; i++) {
            if (visited[i] == false) {
                bfs(graph, visited, i);
                System.out.println();
            }
        }
        System.out.println();
    }
}
