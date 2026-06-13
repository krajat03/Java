import java.util.*;

public class HamidEscape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            int n = sc.nextInt();
            int z = sc.nextInt() - 1;  
            String s = sc.next();

            int left = 0;
            for (int i = z - 1; i >= 0; i--) {
                if (s.charAt(i) == '.') left++;
            }

            int right = 0;
            for (int i = z + 1; i < n; i++) {
                if (s.charAt(i) == '.') right++;
            }

            System.out.println(Math.min(left, right) + 1);
        }

        sc.close();
    }
}
