import  java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter number: ");
        int n = scanner.nextInt();
        System.out.print("-> Enter precision: ");
        int precision = scanner.nextInt();
        scanner.close();

        int tempSol = getSquareRoot(n);

        System.out.println("-> Square root is: " + morePrecision(n, precision, tempSol));

    }

    static double morePrecision(int n, int precision, int tempSol) {
        double factor = 1;
        double ans = tempSol;
    
        for (int i = 0; i < precision; i++) {
            factor = factor / 10;
    
            for (double j = ans; j * j <= n; j = j + factor) {
                ans = j;
            }
        }
        return ans;
    }
    

    static int getSquareRoot(int n) {
        int st = 0, e = n;
        int ans = -1;
        while (st <= e) {
            int mid = st + (e - st) / 2;
            int square = mid * mid;
            if (square == n) {
                return mid;
            } else if (square > n) {
                e = mid - 1;
            } else {
                ans = mid;
                st = mid + 1;
            }
        }
        return ans;
    }

}

