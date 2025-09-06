import java.util.Scanner;

public class SortingSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(arr, scanner);

        ArrayFunctions.arrayOutput(arr);

        selectionSort(arr);

        System.out.print("After sorting ");
        ArrayFunctions.arrayOutput(arr);
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int minIdx = i;

            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

        }
    }
}
