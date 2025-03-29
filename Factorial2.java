import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();

        int fact = getFactorial(num);
        System.out.println("-> " + num + "! = " + fact);
    }

    public static int getFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else
            return num * getFactorial(num - 1);

    }
}
