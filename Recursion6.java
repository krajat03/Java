import java.util.Scanner;

public class Recursion6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter a string: ");
        String s = scanner.nextLine();

        if (checkPl(0, s)) {
            System.out.println(s + " is a palindrome string");
        } else {
            System.out.println(s + " is not a palindrome string");
        }

        scanner.close();
    }

    static boolean checkPl(int i, String s) {
        if (i >= s.length() / 2)
            return true;

        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        return checkPl(i + 1, s);
    }
}