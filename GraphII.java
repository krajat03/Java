import java.util.ArrayList;
import java.util.Scanner;

public class GraphII {

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
            System.out.println();
            System.out.print("-> Enter source: ");
            int src = scanner.nextInt();

            System.out.print("-> Enter destination: ");
            int dest = scanner.nextInt();

            graph[src].add(new Edge(src, dest));
            System.out.println();
        }

    }

    public static void printGraph(ArrayList<Edge> graph[]) {
        System.out.println("\nGraph adjacency list: ");
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

        System.out.print("-> Enter the number of vertices: ");
        int vertices = scanner.nextInt();

        System.out.print("-> Enter the edges of graph: ");
        int edges = scanner.nextInt();

        ArrayList<Edge> graph[] = new ArrayList[vertices];
        createGraph(graph, scanner, edges);

        printGraph(graph);
    }
}
