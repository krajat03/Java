import java.util.Scanner;

public class SortArrayParityII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);

        ArrayFunctions.arrayOutput(array);
        int[] ans = sortArrayByParityII(array);

        ArrayFunctions.arrayOutput(ans);

    }

    public static int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int evenIdx = 0;
        int oddIdx = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && evenIdx < nums.length) {
                ans[evenIdx] = nums[i];
                evenIdx += 2;
            } else if (nums[i] % 2 != 0 && oddIdx < nums.length) {
                ans[oddIdx] = nums[i];
                oddIdx += 2;
            }
        }
        return ans;
    }
}
