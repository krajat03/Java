import java.util.Scanner;
public class HCF {
    public static int computeHCF(int a, int b){
        int smaller = Math.min(a, b);
        int hcf = 1;
        for (int i = 1; i <= smaller; i++) {
            if (a % i == 0 && b % i ==0) {
                hcf = i;
            }
        }
        return hcf;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        scanner.close();
        System.out.println("-> HCF of " + first + " and " + second + " is: " + computeHCF(first, second));
    }
}
