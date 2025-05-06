class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println("   " + root.data);
        System.out.println("  / \\");
        System.out.println(" " + root.left.data + "   " + root.right.data);
    }
}
