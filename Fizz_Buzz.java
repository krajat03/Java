import java.util.Scanner;

public class Fizz_Buzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.print("-> ");
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            }

            else if (i % 3 == 0) {
                System.out.print("Fizz ");
            }

            else if (i % 5 == 0) {
                System.out.print("Buzz ");
            }

            else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}