import java.util.ArrayList;
import java.util.Scanner;

public class GraphIV {

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

    public static void createGraph(ArrayList<Edge> graph, int edges, Scanner scanner) {
        for (int i = 0; i < edges; i++) {
            System.out.print("-> Enter source: ");
            int src = scanner.nextInt();

            System.out.print("-> Enter destination: ");
            int dest = scanner.nextInt();

            System.out.print("-> Enter weight: ");
            int weight = scanner.nextInt();

            graph.add(new Edge(src, dest, weight));
            System.out.println();
        }

    }

    public static void printGraph(ArrayList<Edge> graph) {
        for (Edge e : graph) {
            System.out.println("(" + e.src + " -> " + e.dest + ", wt = " + e.wt + ")");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter number of vertices: ");
        int vertices = scanner.nextInt();

        System.out.print("-> Enter number of edges: ");
        int edges = scanner.nextInt();

        ArrayList<Edge> graph = new ArrayList<>();

        createGraph(graph, edges, scanner);

        System.out.println("Graph is:- ");
        printGraph(graph);

        scanner.close();
    }
}
