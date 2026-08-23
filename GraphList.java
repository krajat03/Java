import java.util.ArrayList;
import java.util.Scanner;

public class GraphList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < e; i++) {
            int first = sc.nextInt();
            int sec = sc.nextInt();

            graph.get(first).add(sec);
            graph.get(sec).add(first);
        }

        for (int i = 1; i <= v; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
