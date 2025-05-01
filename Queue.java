import java.util.Scanner;

class MyQueue {
    int[] Queue;
    int front;
    int rear;
    int size;

    Scanner scanner;

    MyQueue(Scanner scanner) {
        this.scanner = scanner;
        System.out.print("-> Enter size of queue: ");
        size = scanner.nextInt();
        Queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue() {
        if (rear == size - 1) {
            System.out.println("### Queue is full!");
            return;
        }

        if (rear == -1) {
            front = 0;
        }

        System.out.print("-> Enter data: ");
        int data = scanner.nextInt();

        Queue[++rear] = data;

        System.out.println("$Enqueue sucessful!$");
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("### Queue is empty!");
            return;
        }

        System.out.println("-> Dequeued: " + Queue[front]);

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return Queue[front];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public int currentSize() {
        if (isEmpty())
            return 0;
        return rear - front + 1;
    }

    public void printQueue() {
        System.out.print("-> Queue is: ");
        if (isEmpty()) {
            System.out.println("__");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(Queue[i] + " ");
            }
            System.out.println();
        }
    }

    public void printMenu() {
        System.out.println("\n***************************************");
        System.out.println("1) Enqueue");
        System.out.println("2) Dequeue");
        System.out.println("3) Peek element");
        System.out.println("4) Is Empty");
        System.out.println("5) Is Full");
        System.out.println("6) Get current size");
        System.out.println("7) Print Queue");
        System.out.println("8) Exit");
        System.out.print("-> Select an option: ");
    }
}

public class Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyQueue queue = new MyQueue(scanner);

        while (true) {
            queue.printMenu();
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    queue.enqueue();
                    break;

                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    int peek = queue.peek();
                    if (peek != -1)
                        System.out.println("-> Peek element is: " + peek);
                    else
                        System.out.println("### Queue is empty!");
                    break;
                case 4:
                    if (queue.isEmpty())
                        System.out.println("-> Yes, Queue is empty");
                    else
                        System.out.println("-> No, Queue is not empty");
                    break;
                case 5:
                    if (queue.isFull())
                        System.out.println("-> Yes, Queue is full");
                    else
                        System.out.println("-> No, Queue is not full");
                    break;
                case 6:
                    int size = queue.currentSize();
                    System.out.println("-> Size is: " + size);
                    break;
                case 7:
                    queue.printQueue();
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("### Invalid option, try again! ");
                    break;
            }
        }
    }
}
