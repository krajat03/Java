import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortVowelsOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter a string: ");
        String str = scanner.nextLine();

        String ans = sortVowel(str);
        System.out.println("-> Ans: " + ans);

        scanner.close();
    }

    static String sortVowel(String s) {
        List<Character> vowels = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.add(c);
            }
        }

        Collections.sort(vowels);

        char[] word = s.toCharArray();
        int j = 0;
        for (int i = 0; i < word.length; i++) {
            if (isVowel(word[i])) {
                word[i] = vowels.get(j++);
            }
        }

        return new String(word);
    }

    static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}
