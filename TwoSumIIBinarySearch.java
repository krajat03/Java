import java.util.Scanner;

public class TwoSumIIBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);
        ArrayFunctions.arrayOutput(array);

        System.out.print("=> Enter target: ");
        int target = scanner.nextInt();

        int[] ans = twoSumII(array, target);
        ArrayFunctions.arrayOutput(ans);

    }

    public static int[] twoSumII(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            int complement = target - array[i];
            int index = binarySearch(array, i + 1, array.length - 1, complement);

            if (index != -1) {
                return new int[] { i, index };
            }
        }
        return new int[0];
    }

    private static int binarySearch(int[] array, int st, int e, int target) {
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
