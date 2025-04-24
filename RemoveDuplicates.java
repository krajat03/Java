import java.util.Scanner;

public class RemoveDuplicates {
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

        int ans = removeDuplicates(array);
        System.out.println("After removing all duplicates array is: ");
        arrayOutput(array);
        
    }

    public static int[] arrayInput(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;

    }

    public static void arrayOutput(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int removeDuplicates(int[] array) {
        int n = array.length;
        if(n <= 2) return n;
        int j = 2;
        for (int i = 2; i < n; ++i) {
            if (array[i] != array[j - 2]) {
                array[j++] = array[i];
            }
        }
        return j;
    }
}
