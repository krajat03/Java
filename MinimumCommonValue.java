import java.util.Arrays;
import java.util.Scanner;

public class MinimumCommonValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = ArrayFunctions.createArray(scanner);
        ArrayFunctions.arrayInput(arr1, scanner);

        int[] arr2 = ArrayFunctions.createArray(scanner);
        ArrayFunctions.arrayInput(arr2, scanner);

        ArrayFunctions.arrayOutput(arr1);
        ArrayFunctions.arrayOutput(arr2);

        int ans = minimumCommonValue(arr1, arr2);
        System.out.println("-> Minimum common value is: " + ans);

    }

    static int minimumCommonValue(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                return arr1[i];
            } else if (arr1[i] < arr2[i]) {
                i++;
            } else {
                j++;
            }
        }
        return -1;
    }
}
