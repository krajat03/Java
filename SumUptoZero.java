import java.util.Scanner;

public class SumUptoZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter number: ");
        int n = scanner.nextInt();

        int[] ans = sumUptoZero(n);
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();

        scanner.close();
    }

    static int[] sumUptoZero(int n) {
        int st = 0, e = n - 1;
        int posVal = 1, negVal = -1;

        int[] ans = new int[n];

        while (st <= e) {
            if (st == e) {
                ans[st] = 0;
                return ans;
            }

            ans[st] = posVal++;
            ans[e] = negVal--;
            st++;
            e--;
        }
        return ans;
    }
}