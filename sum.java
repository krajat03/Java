import java.util.Scanner;
public class sum {
    public static void main(String args[]) {
        int a,b;
        System.out.print("Enter two values: ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);
        s.close();
    }
}