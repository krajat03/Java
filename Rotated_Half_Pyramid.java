import java.util.*;
public class Rotated_Half_Pyramid {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");      // Printing space
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");      // Printing *
            }
            System.out.println();
        }
        s.close();
    }
}