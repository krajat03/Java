import java.util.Arrays;
import java.util.Scanner;

public class SecLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr =ArrayFunctions.createArray(scanner);
        ArrayFunctions.arrayInput(arr, scanner);




        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;

        // Brute
        // Arrays.sort(arr);
        // largest = arr[arr.length - 1];

        // for (int i = arr.length - 2; i >= 0; i--) {
        //     if (arr[i] < largest) {
        //         secLargest = arr[i];
        //         break;
        //     }
        // }

        // Better
        // for (int val : arr) {
        //     largest = Math.max(val, largest);
        // }

        // for (int val : arr) {
        //     if (val > secLargest && val != largest) {
        //         secLargest = val;
        //     }
        // }

        // Optimal
        for (int val : arr) {
            if (val > largest) {
                secLargest = largest;
                largest = val;
            }
            else if (val < largest && val > secLargest) {
                secLargest = val;
            }
        }

        System.out.println();
        ArrayFunctions.arrayOutput(arr);

        System.out.println("-> Largest value is: "+ largest);
        if (secLargest == Integer.MIN_VALUE) {
            System.out.println("-> All values are same, no second largest value exist");
            return;
        }

        System.out.println("-> Second Largest value is: "+ secLargest);

    }
}
