import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PermutationII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter a string: ");
        String str = scanner.nextLine();

        char[] letters = str.toCharArray();

        Set<String> ans = new HashSet<>();

        getPermut(letters, 0, ans);

        System.out.println("-> All combinations are: ");
        for (String s : ans) {
            System.out.println("  " + s);
        }
        System.out.println("-> Total number of unique combinations are: " + ans.size());

        scanner.close();
    }

    static void getPermut(char[] letters, int idx, Set<String> ans) {
        if (idx == letters.length) {
            String word = new String(letters);
            ans.add(word);
            return;
        }

        for (int i = idx; i < letters.length; i++) {
            swap(letters, idx, i);

            getPermut(letters, idx + 1, ans);

            swap(letters, idx, i);

        }
    }

    static void swap(char[] letters, int i, int j) {
        char temp = letters[i];
        letters[i] = letters[j];
        letters[j] = temp;
    }
}
