// Problem Statement:
// -> Given two strings s and t, return true if they are equal when both are typed into empty text editors. 
//    '#' means a backspace character.

// -> Note that after backspacing an empty text, the text will continue empty.

import java.util.Scanner;
import java.util.Stack;

public class Backspace_String_Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");
        String s = sc.next();

        System.out.print("Enter t: ");
        String t = sc.next();

        boolean equal = check(s, t);

        if (equal) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("No, both strings are different");
        }

        sc.close();
    }

    private static boolean check(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c != '#') {
                st.push(c);
            } else if (!st.isEmpty()) {
                st.pop();
                continue;
            }
        }

        for (char c : t.toCharArray()) {
            if (c != '#') {
                st1.push(c);
            } else if (!st1.isEmpty()) {
                st1.pop();
                continue;
            }
        }

        return st.equals(st1);

    }
}
