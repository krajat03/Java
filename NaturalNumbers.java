import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = s.nextInt();
        s.close();
        if (num < 1) {
            System.out.println("// Invalid input!");
        } else {
            int i = 1;
            System.out.print("Numbers are -> ");
            while (i <= num) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
        }
    }
}