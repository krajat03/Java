import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("-> Enter element: ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter target: ");
        int target = scanner.nextInt();
        scanner.close();

        int result = linearSearch(arr, target);

        if (result == -1)
            System.out.println("=> Invalid target value!");
        else
            System.out.println("=> Targeted element is at index: " + result);
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}