import java.util.*;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("-> Enter the size of the stack: ");
        int size = sc.nextInt();

        int[] stack = new int[size];

        int top = -1;

        while (true) {
            System.out.println("\n1) Push");
            System.out.println("2) Pop");
            System.out.println("3) Display");
            System.out.println("4) Exit");
            System.out.print("-> Choose an option: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    top = push(stack, top, size, sc);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                case 4:
                    System.out.println("Bye bye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option!, try again...");
                    break;
            }
        }
    }

    private static int push(int[] stack, int top, int size, Scanner scanner) {
        if (top == size - 1) {
            System.out.println("Sack overflow!");
        } else {
            System.out.print("-> Enter value: ");
            stack[++top] = scanner.nextInt();
            System.out.println("Value inserted successfully!");
        }
        return top;
    }

    private static int pop(int[] stack, int top) {
        if (top == -1) {
            System.out.println("Stack underflow!");
        } else {
            System.out.println(stack[top--] + " deleted successfully!");
        }
        return top;
    }

    private static void display(int[] stack, int top) {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack is: ");
            for (int i = top; i >= 0; i--) {
                System.out.println("|  " + stack[i] + "  |");
            }
            System.out.println("+-----+");
        }
    }
}
