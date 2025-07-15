import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);

        ArrayFunctions.arrayOutput(array);

        int[] ans = new int[array.length];
        ans = removeDuplicates(array);
        System.out.println("Array after removing duplicates:");
        ArrayFunctions.arrayOutput(ans);

    }

    static int[] removeDuplicates(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int[] result = new int[array.length];

        int idx = 0;
        for (int num : array) {
            if (set.add(num)) {
                result[idx++] = num;
            }
        }

        int[] trimmed = new int[idx];
        for (int i = 0; i < idx; i++) {
            trimmed[i] = result[i];
        }
        return trimmed;
    }
}
