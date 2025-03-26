import java.util.Scanner;

public class Merge_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("-> Enter elements of array1: ");
        arrayInput(scanner, array1);

        System.out.print("Enter the size of array2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("-> Enter elements of array2: ");
        arrayInput(scanner, array2);
        scanner.close();

        int[] ans = mergeArrays(array1, array2);
        System.out.println("Merged array is: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void arrayInput(Scanner scanner, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int size1 = array1.length;
        int size2 = array2.length;

        int[] mergedArray = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }
        return mergedArray;
    }
}
