class Node {
    int data;
    Node left;
    Node right;

    public Node(int val) {
        data = val;
    }
}

class Tree {
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
}

public class MaxDepthOfBinaryTree {
    public static void main(String[] args) {
        Tree tree = new Tree();

        int maxDepth = maxDepth(tree.root);
        System.out.println("Max Depth: " + maxDepth);
    }

    static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);
    }
}
