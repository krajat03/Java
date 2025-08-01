import java.util.HashMap;
import java.util.Scanner;

public class RomanToIntegerII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter Roman value: ");
        String s = scanner.nextLine();
        System.out.println("-> Roman number is: " + s);

        int intval = romanToIntegerII(s);
        System.out.println("-> Integer number is: " + intval);
        scanner.close();

    }

    static int romanToIntegerII(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int curr = map.get(ch);
            
            if (curr < prev) {
                ans -= curr;
            } else {
                ans += curr;
            }

            prev = curr;
        }
        return ans;
    }
}
