import java.util.*;
public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = s.nextInt();
        int columns = s.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || j == 1 || i == rows || j == columns) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}