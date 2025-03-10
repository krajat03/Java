import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("1) Rectangle \n2) Square \n3) Triangle \n--> Enter choice: ");
        if (!s.hasNextInt()) {
            System.out.println("$$ Invalid input! Please enter a number. $$");
            s.close();
            return;
        }
        int input = s.nextInt();
        switch (input) {
            case 1:
                System.out.print("-> Enter length: ");
                int l = s.nextInt();
                System.out.print("-> Enter breadth: ");
                int b = s.nextInt();
                System.out.println("=> Area = " + (l * b));
                break;
            case 2:
                System.out.print("-> Enter side: ");
                int side = s.nextInt();
                System.out.println("=> Area = " + (side * side));
                break;
            case 3:
                System.out.print("-> Enter base: ");
                int base = s.nextInt();
                System.out.print("-> Enter height: ");
                int height = s.nextInt();
                double area = 0.5 * (base * height);
                System.out.printf("=> Area = %.2f%n", area);
                break;
            default:
                System.out.println("$$ Invalid input $$");
                break;
        }
        s.close();
    }
}