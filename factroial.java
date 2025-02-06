import java.util.*;
public class factroial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = s.nextInt();
        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
        s.close();
    }
}