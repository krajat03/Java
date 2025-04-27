import java.util.Scanner;

class MyStack {
    Scanner scanner = new Scanner(System.in);
    int capacity;
    int[] stackarray;
    int top;

    MyStack(int size) {
        capacity = size;
        stackarray = new int[capacity];
        top = -1;

        System.out.println("-> Stack of size " + size + " created sucessfully!");
    }

    void push() {
        if (top == capacity - 1) {
            System.out.println("### Stack Overflow!");
        } else {
            System.out.print("-> Enter value: ");
            int value = scanner.nextInt();
            stackarray[++top] = value;
            System.out.println("-> Value pushed sucessfully!");
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("### Stack Underflow!");
            return -1;
        } else {
            return stackarray[top--];
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("### Stack is empty!");
        } else {
            System.out.println("-> Peek element is: " + stackarray[top]);
        }
    }

    void isEmpty() {
        if (top == -1) {
            System.out.println("-> Yes, Stack is empty!");
        } else {
            System.out.println("-> Stack is not empty");
        }
    }

    void isFull() {
        if (top == capacity - 1) {
            System.out.println("-> Yes, Stack is full!");
        } else {
            System.out.println("-> Stack is not full");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("### Stack is empty!");
        } else {
            System.out.print("-> Elements are: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackarray[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of stack: ");
        int size = scanner.nextInt();
        MyStack st = new MyStack(size);

        while (true) {
            System.out.println("\n***************************************");
            System.out.println("1) PUSH \n2) POP \n3) PEEK \n4) DISPLAY \n5) IS FULL \n6) IS EMPTY \n7) EXIT");
            System.out.print("-> Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    st.push();
                    break;
                case 2:
                    int popped = st.pop();
                    if (popped != -1) {
                        System.out.println("-> Popped element: " + popped);
                    }
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.display();
                    break;
                case 5:
                    st.isFull();
                    break;
                case 6:
                    st.isEmpty();
                    break;
                case 7:
                    scanner.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option, try again!\n");
                    break;
            }
        }
    }
}
