import java.util.Scanner;

public class Disarium_Number2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower number: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper number: ");
        int upper = scanner.nextInt();
        scanner.close();
        System.out.print("Disarium numbers between " + lower + " and " + upper + " are: \n-> ");
        for (int i = lower; i <= upper; i++) {
            int num = i;
            int dis = 0;
            String numString = Integer.toString(num);
            int length = numString.length();

            while (num > 0) {
                int digit = num % 10;
                dis += Math.pow(digit, length);
                length--;
                num /= 10;
            }
            if (dis == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
