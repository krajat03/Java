import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter number: ");
        int num = scanner.nextInt();

        char[] digits = String.valueOf(num).toCharArray();

        HashSet<Integer> ans = new HashSet<>();

        getPermut(digits, 0, ans);

        System.out.println("-> All combinations are: ");
        for (int n : ans) {
            System.out.println(n);
        }
        scanner.close();
    }

    static void getPermut(char[] digits, int idx, Set<Integer> ans) {
        if (idx == digits.length) {
            int num = Integer.parseInt(new String(digits));
            ans.add(num);
            return;
        }

        for (int i = idx; i < digits.length; i++) {
            swap(digits, idx, i);
            getPermut(digits, idx + 1, ans);

            swap(digits, idx, i);
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
