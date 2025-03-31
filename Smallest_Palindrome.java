import java.util.Scanner;

public class Smallest_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine();
        scanner.close();

        String ans = smallestPalindrome(s);
        System.out.println("-> " + ans);
    }

    public static String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                char minChar = (char) Math.min(arr[left], arr[right]);
                arr[left] = minChar;
                arr[right] = minChar;
            }
            left++;
            right--;
        }
        return new String(arr);
    }
}
