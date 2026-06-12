import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class QueueII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node q = new Node(0);
        Node rear = q;
        Node front = q;

        while (true) {
            System.out.println("\n1) Insertion");
            System.out.println("2) Deletion");
            System.out.println("3) Display");
            System.out.println("4) Exit");
            System.out.print("-> Choose an option: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("-> Enter value: ");
                    int val = sc.nextInt();

                    front.next = new Node(val);
                    front = front.next;

                    break;
                case 2:
                    if (front == rear) {
                        System.out.println("Queue underflow!");
                    } else {
                        rear = rear.next;
                        System.out.println(rear.data + " deleted successfully!");
                    }
                    break;

                case 3:
                    if (front == rear) {
                        System.out.println("Queue is empty!");
                    } else {
                        Node dummy = rear.next; // skip dummy node
                        System.out.print("[ ");
                        while (dummy != null) {
                            System.out.print(dummy.data + " ");
                            dummy = dummy.next;
                        }
                        System.out.println("]");
                    }
                    break;
                case 4:
                    sc.close();
                    System.out.println("Bye bye!");
                    return;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}
