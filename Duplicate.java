import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-> Enter element: ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int duplicate = duplicate(arr);
        if (duplicate == -1)
            System.out.println("=> No duplicate element found");
        else
            System.out.println("=> Dupliacte element is: " + duplicate);

    }

    public static int duplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
