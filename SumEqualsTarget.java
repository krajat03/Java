import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class SumEqualsTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);
        Arrays.sort(array);
        ArrayFunctions.arrayOutput(array);

        System.out.print("-> Enter target: ");
        int target = scanner.nextInt();

        Vector<Vector<Integer>> ans = sumEqualsTarget(array, target);
        System.out.println("Target equal sum indexes pairs are: ");
        for (Vector<Integer> i : ans) {
            System.out.print("-> ");
            for (int num : i) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    static Vector<Vector<Integer>> sumEqualsTarget(int[] array, int target) {
        Vector<Vector<Integer>> ans = new Vector<>();
        int st = 0;
        int e = array.length - 1;
        while (st < e) {
            int sum = array[st] + array[e];
            if (sum == target) {
                Vector<Integer> temp = new Vector<>();
                temp.add(st);
                temp.add(e);
                ans.add(temp);
                st++;
                e--;
            } else if (array[st] + array[e] < target) {
                st++;
            } else {
                e--;
            }
        }
        return ans;
    }
}
