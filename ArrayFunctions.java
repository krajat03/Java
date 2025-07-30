import java.util.Scanner;

public class ArrayFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = createArray(scanner);
        String[] str = createStringArray(scanner);

        // Take input of elements of array
        arrayInput(array, scanner);
        arrayStringInput(str, scanner);

        // Print array
        arrayOutput(array);
        arrayStringOutput(str);

    }

    // Create array
    public static int[] createArray(Scanner scanner) {
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        return new int[size];
    }

    // Create String array
    public static String[] createStringArray(Scanner scanner) {
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        return new String[size];
    }

    // Input function
    public static int[] arrayInput(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("-> Enter element: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // String Input function
    public static String[] arrayStringInput(String[] array, Scanner scanner) {
        scanner.nextLine();
        for (int i = 0; i < array.length; i++) {
            System.out.print("-> Enter element: ");
            array[i] = scanner.nextLine();
        }
        return array;
    }

    // Output function
    public static void arrayOutput(int[] array) {
        System.out.print("Array is:- \n-> ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // String Output function
    public static void arrayStringOutput(String[] array) {
        System.out.print("Array is:- \n-> ");
        for (String i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
