import java.util.Scanner;

public class LexicographicallySmallestPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter string: ");
        String s = scanner.nextLine();
        scanner.close();

        System.out.println("-> Before operation string is: " + s);

        String ans = makeSmallestPalindrome(s);

        System.out.println("-> After operation string is: " + ans);
    }

    static String makeSmallestPalindrome(String s) {
        int st = 0, e = s.length() - 1;

        char[] chars = s.toCharArray();
        while (st < e) {
            if (chars[st] != chars[e]) {
                char minChar = (char) Math.min(chars[st], chars[e]);
                chars[st] = minChar;
                chars[e] = minChar;
            }
            st++;
            e--;
        }
        return new String(chars);
    }
}
