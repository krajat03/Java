import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);

        int ans = maxSubarray(array);
        System.out.println("\n-> Largest sum: " + ans);
    }

    static int maxSubarray(int[] array) {
        int sum = 0;
        int maxi = array[0];

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            maxi = Math.max(maxi, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }
}
