import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ArraysIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = ArrayFunctions.createArray(scanner);
        ArrayFunctions.arrayInput(arr1, scanner);

        int[] arr2 = ArrayFunctions.createArray(scanner);
        ArrayFunctions.arrayInput(arr2, scanner);

        System.out.print("\nFirst ");
        ArrayFunctions.arrayOutput(arr1);

        System.out.print("Second ");
        ArrayFunctions.arrayOutput(arr2);

        ArrayList<Integer> inter = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int val : arr1) {
            set.add(val);
        }

        for (int val : arr2) {
            if (set.contains(val) && !inter.contains(val)) {
                inter.add(val);
            }
        }

        System.out.println("Intersection of arrays:- ");
        for (int val : inter) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
