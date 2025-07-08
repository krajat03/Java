import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter num: ");
        int num = scanner.nextInt();
        scanner.close();
        int ans = fact(num);
        System.out.println("-> Factorial of " + num + " is: " + ans);
    }

    static int fact(int num) {

        if (num == 0) {
            return 1;
        }
        // int sec = fact(num - 1);
        // int ans = num * sec;

        return num * fact(num - 1);
    }
}
