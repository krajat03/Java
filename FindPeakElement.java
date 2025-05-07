import java.util.Scanner;

public class FindPeakElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);
        ArrayFunctions.arrayOutput(array);

        int ans = findPeakElement(array);
        System.out.println("-> Peak element is: " + array[ans]);
        System.out.println("-> Peak element is at index: " + ans);
    }

    static int findPeakElement(int[] array) {
        int st = 0, e = array.length - 1;

        while (st < e) {
            int mid = st + (e - st) / 2;

            if (array[mid] < array[mid + 1]) {
                st = mid + 1;
            } else {
                e = mid;
            }
        }
        return st;
    }

}
