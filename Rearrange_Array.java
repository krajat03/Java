import java.util.Scanner;

public class Rearrange_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Invalid size! Array must have at least one element.");
        } else {
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("-> Enter element: ");
                arr[i] = scanner.nextInt();
            }
            System.out.print("Before rearranging array is: \n -> ");
            printArray(arr);

            rearrangeArray(arr);

            System.out.print("After rearranging array is: \n -> ");
            printArray(arr);
        }
        scanner.close();
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void rearrangeArray(int[] arr) {
        int left = 0, right = 0;
        while (right < arr.length) {
            if (arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
    }
}
