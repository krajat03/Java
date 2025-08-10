import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PermutationIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);

        ArrayFunctions.arrayOutput(array);

        Set<List<Integer>> ans = new HashSet<>();

        getPermut(array, 0, ans);

        System.out.println("-> Unique permutations: ");
        for (List<Integer> set : ans) {
            System.out.println(set);
        }
        System.out.println("-> Total number of unique permutations are: " + ans.size());

    }

    static void getPermut(int[] array, int idx, Set<List<Integer>> ans) {
        if (idx == array.length) {
            List<Integer> list = new ArrayList<>();

            for (int num : array) {
                list.add(num);
            }

            ans.add(list);
            return;
        }

        for (int i = idx; i < array.length; i++) {
            swap(array, idx, i);

            getPermut(array, idx + 1, ans);

            swap(array, idx, i);
        }
    }

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
