import java.util.ArrayList;
import java.util.Scanner;

public class GraphFunctions {
    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<ArrayList<Integer>> createUndirectedGraph() {
        System.out.print("-> Enter the number of vertices: ");
        int v = sc.nextInt();

        System.out.print("-> Enter the number of edges: ");
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<Integer>());
        }

        System.out.println("Enter connections:- ");
        for (int i = 0; i < e; i++) {
            int first = sc.nextInt();
            int sec = sc.nextInt();

            graph.get(first).add(sec);
            graph.get(sec).add(first);
        }

        return graph;
    }

    public static ArrayList<ArrayList<Integer>> createDirectedGraph() {
        System.out.print("-> Enter the number of vertices: ");
        int v = sc.nextInt();

        System.out.print("-> Enter the number of edges: ");
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<Integer>());
        }

        System.out.println("Enter connections:- ");
        for (int i = 0; i < e; i++) {
            int first = sc.nextInt();
            int sec = sc.nextInt();

            graph.get(first).add(sec);
        }

        return graph;
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> graph) {
        System.out.println("Graph is:- ");
        for (int i = 1; i < graph.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
