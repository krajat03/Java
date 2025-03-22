import java.util.Scanner;

public class First_Last_Occurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("-> Enter element: ");
            arr[i] = scanner.nextInt();
        }
    
        System.out.print("\n-> Enter target number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.print("Elements are: \n-> ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n-> First occurance of " + num + " is at: " + firstOccurance(arr, size, num));
        System.out.println("-> Last occurance of " + num + " is at: " + lastOccurance(arr, size, num));

    }

    public static int firstOccurance(int[] arr, int size, int num) {
        int l = 0, r = size - 1;
        int firstIndex = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == num) {
                firstIndex = mid;
                r = mid - 1;
            } else if (arr[mid] < num) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return firstIndex;
    }

    public static int lastOccurance(int[] arr, int size, int num) {
        int l = 0, r = size - 1;
        int lastIndex = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == num) {
                lastIndex = mid;
                l = mid + 1;
            } else if (arr[mid] < num) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return lastIndex;
    }
}