import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyList {
    Node head;

    public void appendAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void appendAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void appendAtPosition(Scanner scanner) {
        System.out.print("-> Enter value: ");
        int posdata = scanner.nextInt();
        System.out.print("-> Enter position: ");
        int pos = scanner.nextInt();

        if (pos < 0) {
            System.out.println("Invalid position: Cannot be negative.");
            return;
        }

        Node newNode = new Node(posdata);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int i = 0;
        while (current != null && i < pos - 1) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("## Position out of bounds.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void printList() {
        Node currentNode = head;
        System.out.print("\nLinked list is:-\n=> ");
        while (currentNode != null) {
            System.out.print("|" + currentNode.data + "|-> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}

public class LinkedList {

    public static void displayMenu() {
        System.out.println("\n***************************************");
        System.out.println("1) Insert at First");
        System.out.println("2) Insert at Position");
        System.out.println("3) Insert at Last");
        System.out.println("4) Display Linked list");
        System.out.println("5) Exit");
        System.out.print("-> Select an option: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyList list = new MyList();

        while (true) {
            displayMenu();
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("-> Enter value: ");
                    int firstdata = scanner.nextInt();
                    list.appendAtFirst(firstdata);
                    break;

                case 2:
                    list.appendAtPosition(scanner);
                    break;
                case 3:
                    System.out.print("-> Enter value: ");
                    int lastdata = scanner.nextInt();
                    list.appendAtLast(lastdata);
                    break;
                case 4:
                    list.printList();
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("### Invalid option!, try again");
                    break;
            }
        }
    }
}
