import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Graph_BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> graph = GraphFunctions.createDirectedGraph();

        GraphFunctions.printGraph(graph);

        System.out.print("-> Enter starting node: ");
        int start = sc.nextInt();

        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        
        boolean[] visited = new boolean[graph.size()];
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);

            for (int neighbors : graph.get(node)) {
                if (!visited[neighbors]) {
                    visited[neighbors] = true;
                    q.add(neighbors);
                }
            }
        }

        System.out.println(bfs);
    }
}
