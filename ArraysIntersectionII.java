import java.util.ArrayList;
import java.util.Scanner;

public class ArraysIntersectionII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr1[] = ArrayFunctions.createArray(scanner);
        System.out.println("Enter sorted array:- ");
        ArrayFunctions.arrayInput(arr1, scanner);

        int arr2[] = ArrayFunctions.createArray(scanner);
        System.out.println("Enter sorted array:- ");
        ArrayFunctions.arrayInput(arr2, scanner);

        ArrayList<Integer> ans = intersection(arr1, arr2);

        System.out.print("\nFirst ");
        ArrayFunctions.arrayOutput(arr1);

        System.out.print("Second ");
        ArrayFunctions.arrayOutput(arr2);

        System.out.println("Intersection of arrays:- ");
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();

    }

    static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}
