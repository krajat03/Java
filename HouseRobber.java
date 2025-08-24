import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = ArrayFunctions.createArray(scanner);
        ArrayFunctions.arrayInput(arr, scanner);
        ArrayFunctions.arrayOutput(arr);

        int ans = houseRobber(arr);

        System.out.println("\n-> Total loot: " + ans);

    }

    static int houseRobber(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }

        int[] arr = new int[nums.length];

        arr[0] = nums[0];
        arr[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            arr[i] = Math.max(arr[i - 2] + nums[i], arr[i - 1]);
        }

        int ans = arr[nums.length - 1];
        return ans;
    }
}
