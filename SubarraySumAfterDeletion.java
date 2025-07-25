import java.util.HashSet;
import java.util.Scanner;

public class SubarraySumAfterDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);
        ArrayFunctions.arrayInput(array, scanner);
        ArrayFunctions.arrayOutput(array);

        int sum = maxSum(array);
        System.out.println("-> Ans: " + sum);

    }

    static int maxSum(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;

        for (int num : array) {
            max = Math.max(max, num);
            if (num > 0) {
                set.add(num);
            }
        }

        if (set.isEmpty()) {
            return max;
        }

        int sum = 0;
        for (int val : set) {
            sum += val;
        }
        return sum;
    }
}
