import java.util.*;
public class Solid_rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = s.nextInt();
        int columns = s.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }    
}