import java.util.Scanner;
import java.util.Vector;

public class GoodIndexFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Array is:- ");
        System.out.print("-> ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        goodIndex(array);
    }

    public static void goodIndex(int[] array) {
        Vector<Integer> ans = new Vector<>();
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2 == 0 && i % 2 == 0) || (array[i] % 2 != 0 && i % 2 != 0)) {
                ans.add(i);
            }
        }
        System.out.print("Good indexes are:- \n-> ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
