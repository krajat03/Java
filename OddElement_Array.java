import java.util.Scanner;

public class OddElement_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = s.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("-> Enter element: ");
            array[i] = s.nextInt();
        }
        System.out.print("=> Odd elements are: ");
        for (int i : array) {
            if (i % 2 != 0)
                System.out.print(i + " ");
            else
                continue;
        }
        System.out.println();
        s.close();
    }
}