import java.util.HashMap;
import java.util.Scanner;

public class WordPattern {

    static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }
        
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> revMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            } else {
                map.put(c, word);
            }

            if (revMap.containsKey(word)) {
                if (revMap.get(word) != c) {
                    return false;
                }
            } else {
                revMap.put(word, c);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter words: ");
        String s = scanner.nextLine();

        System.out.print("-> Enter word's pattern: ");
        String pattern = scanner.nextLine();

        boolean ans = wordPattern(pattern, s);

        System.out.println("-> " + ans);
        scanner.close();
    }
}
