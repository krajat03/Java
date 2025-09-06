import java.util.Scanner;

public class Sorting_Bubble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(arr, scanner);

        ArrayFunctions.arrayOutput(arr);

        bubbleSort(arr);

        System.out.print("After sorting ");
        ArrayFunctions.arrayOutput(arr);

        scanner.close();
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            boolean swapped = false;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}
