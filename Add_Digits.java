import java.util.Scanner;

public class Add_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();

        int ans = addDigits(num);
        System.out.println("-> " + ans);
    }

    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}