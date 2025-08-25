import java.util.Scanner;

public class DuplicateZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(arr, scanner);

        ArrayFunctions.arrayOutput(arr);

        duplicateZeros(arr);

        ArrayFunctions.arrayOutput(arr);
    }

    static void duplicateZeros(int[] arr) {
        int zeros = 0;

        for (int i : arr) {
            if (i == 0) {
                zeros++;
            }
        }

        int i = arr.length - 1, j = arr.length + zeros - 1;

        while (i != j) {
            insert(arr, i, j);
            j--;
            if (arr[i] == 0) {
                insert(arr, i, j);
                j--;
            }
            i--;
        }
    }

    static void insert(int[] arr, int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }
}
