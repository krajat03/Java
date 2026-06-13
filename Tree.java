import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int val) {
        data = val;
    }
}

public class Tree {
    Node root;

    public Tree() {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.right.left = new Node(8);

        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        System.out.println("\n***** Tree traversal techniques *****");
        System.out.print("[1] DFS:- \n  a) Inorder traversal:-\n     ");
        inorder(tree.root);

        System.out.print("\n  b) Postorder traversal:-\n     ");
        postorder(tree.root);

        System.out.print("\n  c) Preorder traversal:-\n     ");
        preorder(tree.root);

        System.out.print("\n[2] BFS or Level order traversal:-\n     ");
        bfs(tree.root);

    }

    public static void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);

    }

    public static void postorder(Node node) {
        if (node == null)
            return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void preorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
        System.out.println();
    }
}
