import java.util.ArrayList;
import java.util.Scanner;

public class ArraysUnionII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(arr1, scanner);

        int[] arr2 = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(arr2, scanner);

        ArrayList<Integer> union = arrayUnion(arr1, arr2);

        System.out.print("\nFirst ");
        ArrayFunctions.arrayOutput(arr1);

        System.out.print("Second ");
        ArrayFunctions.arrayOutput(arr2);

        System.out.println("Union array is: ");
        for (int val : union) {
            System.out.print(val + " ");
        }
        System.out.println();

        scanner.close();
    }

    static ArrayList<Integer> arrayUnion(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0, j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;

            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (j < arr2.length) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        while (i < arr1.length) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        return union;

    }
}
