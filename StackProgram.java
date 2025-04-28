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
        if (isFull()) {
            System.out.println("\n### Stack is full:- ");
            System.out.print("1) For expansion \n2) Continue without pushing \n-> Select an option: ");
            int expand = scanner.nextInt();
            if (expand == 1) {
                int[] newStack = new int[capacity * 2];
                for (int i = 0; i < stackarray.length; i++) {
                    newStack[i] = stackarray[i];
                }
                stackarray = newStack;
                capacity = capacity * 2;
                System.out.println("### Stack expansion sucessful! New capacity: " + capacity);
            } else {
                System.out.println("=> Returning to menu...");
                return;
            }
        }
        System.out.print("-> Enter value: ");
        int value = scanner.nextInt();
        stackarray[++top] = value;
        System.out.println("-> Value pushed successfully!");

    }

    int pop() {
        if (top == -1) {
            System.out.println("### Nothing to pop!");
            return -1;
        } else {
            return stackarray[top--];
        }
    }

    int peek() {
        if (top == -1) {
            return -1;
        } else {
            return stackarray[top];
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == capacity - 1;
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

public class StackProgram {
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
                    int value = st.peek();
                    if (value < 0) {
                        System.out.println("### Stack is empty!");
                    } else {
                        System.out.println("-> Peek element is: " + value);
                    }
                    break;
                case 4:
                    st.display();
                    break;
                case 5:
                    if (st.isFull()) {
                        System.out.println("-> Yes, Stack is full!");
                    } else {
                        System.out.println("-> No, Stack is not full");
                    }
                    break;
                case 6:
                    if (st.isEmpty()) {
                        System.out.println("-> Yes, Stack is empty!");
                    } else {
                        System.out.println("-> No, Stack is not empty");
                    }
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
