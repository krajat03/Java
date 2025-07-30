import java.util.Scanner;
import java.util.Stack;

public class BaseBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] operations = ArrayFunctions.createStringArray(scanner);
        ArrayFunctions.arrayStringInput(operations, scanner);
        ArrayFunctions.arrayStringOutput(operations);

        int score = baseBall(operations);
        System.out.println("-> Score is: " + score);

    }

    static int baseBall(String[] array) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;

        for (String op : array) {
            if (op.equals("C") && !st.empty()) {
                st.pop();
            } else if (op.equals("D") && !st.isEmpty()) {
                st.push(2 * (st.peek()));
            } else if (op.equals("+") && st.size() >= 2) {
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
            } else {
                st.push(Integer.parseInt(op));
            }
        }

        for (int score : st) {
            sum += score;
        }
        return sum;
    }
}
