import java.util.Scanner;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);

        System.out.println("Enter elements of a rotated sorted array:");
        ArrayFunctions.arrayInput(array, scanner);

        ArrayFunctions.arrayOutput(array);

        System.out.print("-> Enter target value: ");
        int target = scanner.nextInt();

        int ans = searchInRotatedSortedArray(array, target);
        if (ans == -1) {
            System.out.println("-> Target not found!");
        } else {
            System.out.println("-> Target is at index: " + ans);
        }

    }

    static int searchInRotatedSortedArray(int[] array, int target) {

        int pivot = getPivot(array);
        int n = array.length;

        if (array[pivot] <= target && target <= array[n - 1]) {
            return binarySearch(array, target, pivot, n - 1);
        } else {
            return binarySearch(array, target, 0, pivot - 1);
        }

    }

    static int getPivot(int[] array) {
        int st = 0, e = array.length - 1;
        while (st < e) {
            int mid = st + (e - st) / 2;
            if (array[mid] >= array[0]) {
                st = mid + 1;
            } else {
                e = mid;
            }
        }
        return st;
    }

    static int binarySearch(int[] array, int target, int st, int e) {
        while (st <= e) {
            int mid = st + (e - st) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                st = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
