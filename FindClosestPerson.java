import java.util.Scanner;

public class FindClosestPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To Find the closest person between A and B from C enter values:- ");
        System.out.print("-> Enter position of person A: ");
        int a = scanner.nextInt();

        System.out.print("-> Enter position of person B: ");
        int b = scanner.nextInt();

        System.out.print("-> Enter position of person C: ");
        int c = scanner.nextInt();
        scanner.close();

        int ans = findClosest(a, b, c);

        if (ans == 1) {
            System.out.println("=> A is closest from C");
        } else if (ans == 2) {
            System.out.println("=> B is closest from C");
        } else
            System.out.println("=> Both A and B are equidistant from C");

    }

    public static int findClosest(int a, int b, int c) {
        int dist1 = Math.abs(a - c);
        int dist2 = Math.abs(b - c);

        if (dist1 < dist2)
            return 1;
        else if (dist1 > dist2)
            return 2;
        return 0;
    }
}
