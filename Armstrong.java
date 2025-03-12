import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();

        String numString = Integer.toString(number);    // conveting number into String
        int totalDigits = numString.length();           // for power

        int sum = 0;
        int tempNum = number;

        while (tempNum > 0) {
            int digit = tempNum % 10;
            sum += Math.pow(digit, totalDigits);
            tempNum /= 10;
        }
        if (sum == number) {
            System.out.println("-> " + number + " is an armstrong number");
        } else
            System.out.println("-> " + number + " is not an armstrong number");
    }
}