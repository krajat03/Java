import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("-> Enter element: ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.print("Enter target: ");
        int target = scanner.nextInt();
        scanner.close();

        int result = binarySearch(arr, target);

        if (result == -1)
            System.out.println("=> Target not found!");
        else
            System.out.println("=> Targeted element is at index: " + result);
    }

    public static int binarySearch(int[] arr, int target) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}