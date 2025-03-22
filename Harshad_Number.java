import java.util.Scanner;

public class Harshad_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        if (num % sum == 0)
            System.out.println("-> It is a Harsad number");
        else
            System.out.println("-> It is not a Harshad number");
    }
}