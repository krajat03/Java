import java.util.Scanner;

public class Disarium_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();
        int power = 0;
        int temp = num;
        // Calculating power
        while (temp > 0) {
            temp /= 10;
            power++;
        }
        int mask = num;
        int dis = 0;
        // Calulating sum of power of digits
        while (mask > 0) {
            int digit = mask % 10;
            dis += Math.pow(digit, power);
            mask /= 10;
            power--;
        }
        if (dis == num)
            System.out.println("-> It is a Disarium number");
        else
            System.out.println("-> It is a not Disarium number");
    }
}