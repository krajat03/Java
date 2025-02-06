import java.util.*;
public class Number_Half_Pyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        s.close();
    }
}