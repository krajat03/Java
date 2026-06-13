import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class StackII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListNode head = null;

        while (true) {
            System.out.println("\n1) Push");
            System.out.println("2) Pop");
            System.out.println("3) Display");
            System.out.println("4) Exit");
            System.out.print("-> Choose an option: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    head = push(head, sc);
                    break;
                case 2:
                    head = pop(head);
                    break;
                case 3:
                    display(head);
                    break;
                case 4:
                    sc.close();
                    System.out.println("Bye bye!");
                    return;
                default:
                    System.out.println("Invalid option!, try again...");
                    break;
            }
        }
    }

    private static ListNode push(ListNode head, Scanner sc) {
        System.out.print("-> Enter value: ");
        int val = sc.nextInt();

        ListNode node = new ListNode(val);
        node.next = head;

        System.out.println("Value pushed successfully!");
        return node;
    }

    private static ListNode pop(ListNode head) {
        if (head == null) {
            System.out.println("Stack underflow!");
            return null;
        }

        System.out.println(head.val + " popped successfully!");
        return head.next;
    }

    private static void display(ListNode head) {
        if (head == null) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.println("\nTOP");
        ListNode temp = head;

        while (temp != null) {
            System.out.println("+-----+");
            System.out.println("|  " + temp.val + "  |");
            temp = temp.next;
        }
        System.out.println("+-----+");
    }
}