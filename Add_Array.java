import java.util.Scanner;

public class Add_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array1: ");
        int size1 = scanner.nextInt();
        System.out.print("Enter size of array2: ");
        int size2 = scanner.nextInt();

        int maxSize = Math.max(size1, size2);
        int[] arr1 = new int[maxSize];
        int[] arr2 = new int[maxSize];

        System.out.println("-> Enter elements of array1: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("-> Enter elements of array2: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        System.out.print("-> { ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.print("}\n");
        System.out.print("-> { ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }

        System.out.print("}\n-> Sum Array: { ");
        for (int i = 0; i < maxSize; i++) {
            System.out.print((arr1[i] + arr2[i]) + " ");
        }
        System.out.print("}\n");

        scanner.close();
    }
}