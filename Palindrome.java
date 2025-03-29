import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();

        boolean check = isPalindrome(num);

        if (check)
            System.out.println("-> " + num + " is a palindrome number");
        else
            System.out.println("-> " + num + " is not a palindrome number");

    }

    public static boolean isPalindrome(int num) {
        int temp = num;
        int reversed = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return reversed == num;
    }
}
