import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        if (size < 2) {
            System.out.println("-> Array must have two elements");
            return;
        }

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("-> Enter element: ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < size; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("\nLargest is: " + largest);
        if (secondLargest == Integer.MIN_VALUE)
            System.out.println("-> No second largest element in the array");
        else
            System.out.println("Second largest is: " + secondLargest);
    }
}