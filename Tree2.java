import java.util.Stack;

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
        root.right = new Node(7);

        root.left.left = new Node(3);
        root.left.right = new Node(4);

        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);
    }
}

public class Tree2 {
    public static void main(String[] args) {
        Tree tree = new Tree();

        System.out.println("Preorder:- ");
        preorder(tree.root);

        System.out.println("\nInorder:- ");
        inorder(tree.root);

        System.out.println("\nPostorder:- ");
        postorder(tree.root);
    }

    static void preorder(Node root) {
        Stack<Node> st = new Stack<>();

        st.push(root);
        while (!st.isEmpty()) {
            Node curr = st.pop();
            System.out.print(curr.data + " ");

            if (curr.right != null) {
                st.push(curr.right);
            }
            if (curr.left != null) {
                st.push(curr.left);
            }
        }
    }

    static void inorder(Node root) {
        Stack<Node> st = new Stack<>();

        Node node = root;
        while (true) {
            if (node != null) {
                st.push(node);
                node = node.left;
            } else {
                if (st.isEmpty()) {
                    break;
                }
                node = st.pop();
                System.out.print(node.data + " ");
                node = node.right;
            }
        }
    }

    static void postorder(Node root) {
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        if (root == null) {
            return;
        }
        st1.push(root);
        while (!st1.isEmpty()) {
            Node curr = st1.pop();
            st2.push(curr);

            if (curr.left != null) {
                st1.push(curr.left);
            }
            if (curr.right != null) {
                st1.push(curr.right);
            }
        }
        while (!st2.isEmpty()) {
            System.out.print(st2.pop().data + " ");
        }
    }

    static void postorder2(Node root) {
        Stack<Node> st = new Stack<>();
        Node curr = root;

        while (curr != null || !st.isEmpty()) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                Node temp = st.peek().right;
                if (temp == null) {
                    temp = st.peek();
                    st.pop();
                }
            }
        }
    }

}
