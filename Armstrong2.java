import java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower limit of interval: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper limit of interval: ");
        int upper = scanner.nextInt();
        scanner.close();

        for (int num = lower; num <= upper; num++) {
            int temp = num;
            String numString = Integer.toString(temp);
            int power = numString.length(); // calculating power
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, power);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println("-> " + num);
            }
        }
    }
}