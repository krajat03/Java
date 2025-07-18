import java.util.Scanner;

public class TwoSumII {
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

    static int[] twoSumII(int[] array, int target) {
        int st = 0, e = array.length - 1;
        while (st < e) {
            int sum = array[st] + array[e];
            if (sum == target) {
                return new int[] { st, e };
            } else if (sum < target) {
                st++;
            } else {
                e--;
            }
        }
        return new int[0];
    }

}
