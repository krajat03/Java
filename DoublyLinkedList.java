import java.util.Scanner;

class Node {
    int data;
    Node pre;
    Node next;

    Node(int data) {
        this.data = data;
        this.pre = null;
        this.next = null;
    }
}

class MyList {
    Node head;

    public void appendAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.pre = newNode;
        head = newNode;
    }

    public void appendAtPosition(Scanner scanner) {

        System.out.print("-> Enter position: ");
        int pos = scanner.nextInt();

        if (pos < 0) {
            System.out.println("### Invalid position");
            return;
        }

        int length = getLength();
        if (pos > length) {
            System.out.println("### Position out of bound, Max allowed: " + length);
            return;
        }

        System.out.print("-> Enter data: ");
        int data = scanner.nextInt();

        Node newNode = new Node(data);

        if (pos == 0) {
            if (head != null) {
                newNode.next = head;
                head.pre = newNode;
            }
            head = newNode;
            return;
        }

        Node currentNode = head;
        int i = 0;
        while (currentNode != null && i < pos - 1) {
            currentNode = currentNode.next;
            i++;
        }

        newNode.next = currentNode.next;
        newNode.pre = currentNode;

        if (currentNode.next != null) {
            currentNode.next.pre = newNode;
        }

        currentNode.next = newNode;

    }

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
        newNode.pre = currentNode;
        newNode.next = null;
    }

    public void printList() {
        if (head == null) {
            System.out.println("\nLinked list is:-\n=> null <-> null");
            return;
        }

        Node currentNode = head;
        System.out.print("\nLinked list is:-\n=> ");
        System.out.print("null <-> ");
        while (currentNode != null) {
            System.out.print("|" + currentNode.data + "| <-> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void printReverseList() {
        if (head == null) {
            System.out.println("\nReversed Linked list is:-\n=> null <-> null");
            return;
        }

        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        System.out.print("\nReversed Linked list is:-\n=> ");
        System.out.print("null <-> ");
        while (currentNode != null) {
            System.out.print("|" + currentNode.data + "| <-> ");
            currentNode = currentNode.pre;
        }
        System.out.println("null");
    }

    public int getLength() {
        Node currentNode = head;
        int count = 0;
        while (currentNode != null) {
            currentNode = currentNode.next;
            count++;
        }
        return count;
    }
}

public class DoublyLinkedList {
    public static void displayMenu() {
        System.out.println("\n***************************************");
        System.out.println("1) Insert at First");
        System.out.println("2) Insert at Position");
        System.out.println("3) Insert at Last");
        System.out.println("4) Display Linked list");
        System.out.println("5) Display Reversed Linked list");
        System.out.println("6) Length of the list");
        System.out.println("7) Exit");
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
                    System.out.print("-> Enter data: ");
                    int firstdata = scanner.nextInt();
                    list.appendAtFirst(firstdata);
                    break;
                case 2:
                    list.appendAtPosition(scanner);
                    break;
                case 3:
                    System.out.print("-> Enter data: ");
                    int lastdata = scanner.nextInt();
                    list.appendAtLast(lastdata);
                    break;
                case 4:
                    list.printList();
                    break;
                case 5:
                    list.printReverseList();
                    break;
                case 6:
                    int length = list.getLength();
                    if (length == 0)
                        System.out.println("-> List is empty");
                    else
                        System.out.println("-> Length is: " + length);
                    break;
                case 7:
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