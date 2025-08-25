import java.util.Scanner;
import java.util.Stack;

public class RemoveAdjacentDuplicatesInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter a string: ");
        String s = scanner.nextLine();

        System.out.println("-> String is: " + s);
        String ans = removeDuplicates(s);
        System.out.println("-> Ans " + ans);

        scanner.close();

    }

    static String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!st.empty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!st.empty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}
