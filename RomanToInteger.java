import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter Roman value: ");
        String s = scanner.nextLine();
        System.out.println("-> Roman number is: " + s);

        int intval = romanToInteger(s);
        System.out.println("-> Integer number is: " + intval);
        scanner.close();

    }

    static int getVal(char s) {
        if (s == 'I')
            return 1;
        else if (s == 'V')
            return 5;
        else if (s == 'X')
            return 10;
        else if (s == 'L')
            return 50;
        else if (s == 'C')
            return 100;
        else if (s == 'D')
            return 500;
        else if (s == 'M')
            return 1000;

        return -1;
    }

    static int romanToInteger(String s) {
        int ans = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = getVal(s.charAt(i));

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
