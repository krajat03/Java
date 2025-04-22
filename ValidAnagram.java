import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word1: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter word2: ");
        String word2 = scanner.nextLine();
        scanner.close();

        boolean check = validAnagram(word1, word2);
        if (check) {
            System.out.println("-> Valid Anagram");
        } else {
            System.out.println("-> Not a Valid Anagram");

        }
    }

    public static boolean validAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        
        char[] array1 = word1.toCharArray();
        Arrays.sort(array1);
        char[] array2 = word2.toCharArray();
        Arrays.sort(array2);

        word1 = new String(array1);
        word2 = new String(array2);
        
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
