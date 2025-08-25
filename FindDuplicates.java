import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(arr, scanner);

        ArrayFunctions.arrayOutput(arr);

        ArrayList<Integer> ans = new ArrayList<>(findDuplicates(arr));

        System.out.println("\n-> Ans is:- ");
        System.out.println("-> " + ans);
    }

    static List<Integer> findDuplicates(int[] arr) {
        int n = arr.length;

        int[] freq = new int[n + 1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (freq[i] == 2) {
                ans.add(i);
            }
        }
        return ans;
    }
}
