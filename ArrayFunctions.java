import java.util.Scanner;

public class ArrayFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create array
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];

        // Take input of elements of array
        System.out.println("Enter elements of array:- ");
        arrayInput(array, scanner);

        // Print array
        System.out.println("Array is:- ");
        arrayOutput(array);

    }

    // Input function
    public static int[] arrayInput(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Output function
    public static void arrayOutput(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
