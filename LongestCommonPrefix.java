import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter size of string array: ");

        int size = scanner.nextInt();
        String[] strs = new String[size];

        for (int i = 0; i < strs.length; i++) {
            System.out.print("-> Enter word: ");
            strs[i] = scanner.next();

        }

        String ans = longestCommonPrefix(strs);
        System.out.println("\n-> Longest common prefix is: " + ans);

        scanner.close();
    }

    static String longestCommonPrefix(String[] strs) {
        int n = strs.length;

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[n - 1].toCharArray();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
}
