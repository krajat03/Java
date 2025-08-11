import java.util.Scanner;

public class QuickSort {
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static int partition(int[] array, int st, int end) {
        int idx = st - 1, pivot = array[end];

        for (int i = st; i < end; i++) {
            if (array[i] < pivot) {
                idx++;
                swap(array, i, idx);
            }
        }

        idx++;
        swap(array, end, idx);
        return idx;
    }

    static void quickSort(int[] array, int st, int end) {
        if (st < end) {
            int pivot = partition(array, st, end);

            quickSort(array, st, pivot - 1); // left half
            quickSort(array, pivot + 1, end); // right half
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);

        System.out.println("\nOriginal array is:- ");
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();

        quickSort(array, 0, array.length - 1);

        System.out.println("\nSorted array is:- ");
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
