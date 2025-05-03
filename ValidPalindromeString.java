import java.util.Scanner;

public class ValidPalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter string: ");
        String s = scanner.nextLine();
        scanner.close();

        if (isPalindrome(s)) {
            System.out.println("-> String is palindrome");
        } else {
            System.out.println("-> String is not palindrome");
        }
    }

    static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        int left = 0, right = s.length() - 1;
        s = s.toLowerCase();
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
