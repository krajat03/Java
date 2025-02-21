import java.util.*;

public class swap2 {
    public static void main(String[] args) {
        System.out.print("Enter the value of a: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print("Enter the value of b: ");
        int b = s.nextInt();
        s.close();
        System.out.println("* Brfore swapping values are: \n-> a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("* After swapping values are: \n-> a = " + a + ", b = " + b);
    }
}
