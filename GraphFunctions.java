import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
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

    public static ArrayList<Integer> graphBFS(ArrayList<ArrayList<Integer>> graph) {
        ArrayList<Integer> bfs = new ArrayList<>();

        Queue<Integer> q = new LinkedList();

        System.out.print("-> Enter starting node: ");
        int start = sc.nextInt();
        q.add(start);

        boolean[] vis = new boolean[graph.size()];
        vis[start] = true;
        System.out.println(start);

        while (!q.isEmpty()) {
            int curr = q.poll();
            bfs.add(curr);
            for (int nei : graph.get(curr)) {
                if (!vis[nei]) {
                    vis[nei] = true;
                    q.add(nei);
                }
            }
        }

        return bfs;
    }

    public static void graphDFS(ArrayList<ArrayList<Integer>> graph, boolean[] vis, int node, ArrayList<Integer> dfs) {
        if (vis[node]) {
            return;
        }

        vis[node] = true;
        dfs.add(node);

        for (int nei : graph.get(node)) {
            if (!vis[nei]) {
                graphDFS(graph, vis, nei, dfs);
            }
        }
    }
}
