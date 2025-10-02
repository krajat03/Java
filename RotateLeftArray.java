import java.util.Scanner;

public class RotateLeftArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(arr, scanner);

        System.out.print("\nEnter the value of rotation: ");
        int k = scanner.nextInt();

        System.out.print("Original ");
        ArrayFunctions.arrayOutput(arr);

        rotateLeftArray(arr, k);

        System.out.print("Rotated ");
        ArrayFunctions.arrayOutput(arr);
    }

    static void rotateLeftArray(int[] arr, int k) {
        int n = arr.length;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - (n - k)];
        }
    }
}
