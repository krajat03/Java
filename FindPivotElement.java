import java.util.Scanner;

public class FindPivotElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);

        System.out.println("Enter elements of a rotated sorted array:");
        ArrayFunctions.arrayInput(array, scanner);
        ArrayFunctions.arrayOutput(array);

        int ans = findPivotElement(array);
        System.out.println("-> Pivot element is: " + array[ans]);
        System.out.println("-> Pivot element is at index: " + ans);
    }

    static int findPivotElement(int[] array) {
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
}
