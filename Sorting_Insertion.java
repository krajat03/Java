import java.util.Scanner;

public class Sorting_Insertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(arr, scanner);

        ArrayFunctions.arrayOutput(arr);

        insertionSort(arr);

        System.out.print("After sorting ");
        ArrayFunctions.arrayOutput(arr);
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
    }
}
