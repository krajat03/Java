import java.util.Scanner;
public class Harshad_Number2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower number: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper number: ");
        int upper = scanner.nextInt();
        scanner.close();
        System.out.print("\nHarshad number between " + lower + " and " + upper + " are:\n-> ");
        HarshadNumber(lower, upper);
    }
    public static void HarshadNumber(int lower, int upper){
        for (int i = lower; i <= upper; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;    
            }
            if (i % sum == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}