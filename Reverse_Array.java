import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("-> Enter element: ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.print("Before reversing: \n-> ");
        printArray(arr);

        reverseArray(arr);

        System.out.print("After reversing: \n-> ");
        printArray(arr);
    }

    public static void reverseArray(int[] arr) {
        int s = 0, e = arr.length - 1;

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
