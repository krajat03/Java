import java.util.ArrayList;
import java.util.Scanner;

public class SlidingWindow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);
        System.out.print("-> Enter k: ");
        int k = scanner.nextInt();

        ArrayFunctions.arrayOutput(array);

        int ans = maxSum(array, k);
        System.out.println("-> Max sum of subarray of size " + k + " is: " + ans);
    }

    static int maxSum(int[] array, int k) {
        if (array.length < k) {
            System.out.println("### Window size is greater than array size. Returning 0 as default.");
            return 0;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= array.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += array[j];
            }
            ans.add(sum);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i) > max) {
                max = ans.get(i);
            }
        }
        return max;
    }

}