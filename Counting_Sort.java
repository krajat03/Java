import java.util.Scanner;

public class Counting_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n# Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("-> " + (i + 1) + ") Enter element: ");
            arr[i] = sc.nextInt();
        }

        countingSort(arr);

        System.out.println("Sorted Array is: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }

    private static void countingSort(int[] nums) {
        int max = nums[0];

        for (int i : nums) {
            max = Math.max(i, max);
        }

        int[] freq = new int[max + 1];

        for (int i : nums) {
            freq[i]++;
        }

        int idx = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                nums[idx++] = i;
                freq[i]--;
            }
        }
    }
}
