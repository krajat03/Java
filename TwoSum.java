import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);
        ArrayFunctions.arrayOutput(array);

        System.out.print("=> Enter target: ");
        int target = scanner.nextInt();

        int[] ans = twoSum(array, target);
        ArrayFunctions.arrayOutput(ans);
    }

    static int[] twoSum(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(array[i], i);
        }
        return new int[0];
    }
}
