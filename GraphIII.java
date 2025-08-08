import java.util.ArrayList;
import java.util.Scanner;

public class GraphIII {

    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int edges, Scanner scanner) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edges; i++) {
            System.out.print("-> Enter source: ");
            int src = scanner.nextInt();

            System.out.print("-> Enter destination: ");
            int dest = scanner.nextInt();

            System.out.print("-> Enter weight: ");
            int wt = scanner.nextInt();

            graph[src].add(new Edge(src, dest, wt));
            System.out.println();
        }
    }

    static void printGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print("{" + e.dest + "," + e.wt + "} ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter number of vertices: ");
        int vertices = scanner.nextInt();

        System.out.print("-> Enter number of edges: ");
        int edges = scanner.nextInt();

        ArrayList<Edge> graph[] = new ArrayList[vertices];

        createGraph(graph, edges, scanner);

        printGraph(graph);

        scanner.close();
    }
}
