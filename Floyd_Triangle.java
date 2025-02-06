import java.util.*;

public class Floyd_Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
        s.close();
        int num = 1;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}