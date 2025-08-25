import java.util.Scanner;
import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter the number: ");
        String num = scanner.nextLine();

        System.out.print("-> Enter the value of k: ");
        int k = scanner.nextInt();

        String ans = removeKDigits(num, k);

        System.out.println("-> Ans: " + ans);

        scanner.close();
    }

    static String removeKDigits(String num, int k){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (!st.empty() && k > 0 && st.peek() > c) {
                st.pop();
                k--;
            }
            st.push(c);
        }

        while (k > 0 && !st.empty()) {
            st.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();
        while (!st.empty()) {
            ans.append(st.pop());
        }
        ans.reverse();

        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }

        return ans.length() == 0 ? "0" : ans.toString();
    }
}
