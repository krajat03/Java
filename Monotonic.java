import java.util.Scanner;

public class Monotonic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of arr: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("-> Enter element: ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Elements: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        if (isMonotonic(arr)) {
            System.out.println("\n-> It is a Monotonic series");
        } else {
            System.out.println("\n-> It is not a Monotonic series");
        }
        scanner.close();
    }

    public static boolean isMonotonic(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }
        boolean increasing = true, decreasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                decreasing = false;
            }
            if (arr[i] <= arr[i - 1]) {
                increasing = false;
            }
        }
        return increasing || decreasing;
    }
}
