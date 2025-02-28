import java.util.*;

public class ArrayAdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = s.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("-> Enter element: ");
            array[i] = s.nextInt();
        }
        s.close();
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.println("=> Sum: " + sum);
    }
}