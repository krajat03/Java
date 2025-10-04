import java.util.TreeSet;

public class ArraysUnion {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5, 6 };

        TreeSet<Integer> set = new TreeSet<>();

        for (int x : arr1)
            set.add(x);
        for (int x : arr2)
            set.add(x);

        int[] union = new int[set.size()];
        int i = 0;
        for (int data : set) {
            union[i++] = data;
        }

        System.out.print("Union ");
        ArrayFunctions.arrayOutput(union);
    }
}
