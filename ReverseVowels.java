import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter string: ");
        String word = scanner.nextLine();
        scanner.close();
        System.out.println("\n-> Before reversing: " + word);

        String rev = reverseVowels(word);

        System.out.println("-> After reversing: " + rev);
    }

    static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    static String reverseVowels(String word) {
        int st = 0;
        int e = word.length() - 1;

        char[] chars = word.toCharArray();
        while (st < e) {
            if (st < e && !isVowel(chars[st])) {
                st++;
            } else if (st < e && !isVowel(chars[e])) {
                e--;
            } else { // --> ((isVowel(chars[st])) && (isVowel(chars[e])))
                char temp = chars[st];
                chars[st] = chars[e];
                chars[e] = temp;
                st++;
                e--;
            }
        }
        return new String(chars);
    }
}
