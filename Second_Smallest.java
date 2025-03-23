import java.util.Scanner;

public class Second_Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        if (size < 2) {
            System.out.println("-> Array must have two elements");
        } else {
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("-> Enter element: ");
                arr[i] = scanner.nextInt();
            }

            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

            for (int num : arr) {
                if (num < smallest) {
                    secondSmallest = smallest;
                    smallest = num;
                } else if (num > smallest && num < secondSmallest) {
                    secondSmallest = num;
                }
            }
            System.out.println("\nSmallest is: " + smallest);
            if (secondSmallest == Integer.MAX_VALUE)
                System.out.println("-> No second smallest element in the array");
            else
                System.out.println("Second smallest is: " + secondSmallest);
        }
        scanner.close();
    }
}