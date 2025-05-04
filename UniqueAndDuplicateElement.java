import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class UniqueAndDuplicateElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);
        ArrayFunctions.arrayOutput(array);

        Vector<Integer> ans = uniqueElements(array);
        System.out.print("Unique elements:- \n-> ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();

        HashSet<Integer> duplicates = duplicateElements(array);
        System.out.print("Duplicate elements:- \n-> ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    static Vector<Integer> uniqueElements(int[] array) {
        Vector<Integer> ans = new Vector<>();
        Arrays.sort(array);
        int i = 0;
        while (i < array.length) {
            int j = i + 1;
            while (j < array.length && array[i] == array[j]) {
                j++;
            }
            if (j == i + 1) {
                ans.add(array[i]);
            }
            i = j;
        }
        return ans;
    }

    static HashSet<Integer> duplicateElements(int[] array) {
        HashSet<Integer> ans = new HashSet<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                ans.add(array[i]);
            }
        }
        return ans;
    }
}
