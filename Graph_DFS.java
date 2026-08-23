import java.util.ArrayList;
import java.util.Scanner;

public class Graph_DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> graph = GraphFunctions.createDirectedGraph();

        
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[graph.size()];
        
        System.out.print("-> Enter starting node: ");
        int start = sc.nextInt();
        
        GraphFunctions.printGraph(graph);

        dfs(graph, list, start, visited);
        System.out.println(list);

        sc.close();
    }

    private static void dfs(ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> list, int node,
            boolean[] visited) {

        visited[node] = true;
        list.add(node);

        for (int neigh : graph.get(node)) {
            if (!visited[neigh]) {
                dfs(graph, list, neigh, visited);
            }
        }
    }
}
