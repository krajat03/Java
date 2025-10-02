import java.util.Scanner;

public class RotateLeftArrayII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(arr, scanner);

        System.out.print("Enter the value of rotation: ");
        int k = scanner.nextInt();

        System.out.print("Original ");
        ArrayFunctions.arrayOutput(arr);

        rotateArray(arr, k);

        System.out.print("Rotated ");
        ArrayFunctions.arrayOutput(arr);
    }

    static void rotateArray(int[] arr, int k) {
        int n = arr.length;

        k = k % n;

        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);

        reverse(arr, 0, n - 1);

    }

    static void reverse(int[] arr, int first, int last) {
        while (first < last) {
            int temp = arr[first];
            arr[first++] = arr[last];
            arr[last--] = temp;
        }
    }
}
