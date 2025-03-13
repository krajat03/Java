import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character value: ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        int ascii = (int) ch;
        System.out.println("-> The ASCII value of " + ch + " is: " + ascii);
    }
}