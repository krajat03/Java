import java.util.Scanner;
public class Missing_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n (total numbers including missing one): ");
        int n = scanner.nextInt();
        int[] arr = new int[n - 1];

        int sumActual = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-> Enter element: ");
            arr[i] = scanner.nextInt();
            sumActual += arr[i];
        }
        scanner.close();

        int sumExpected = n * (n + 1) / 2;

        int missingNumber = sumExpected - sumActual;
        System.out.println("=> Missing number is: " + missingNumber);
    }
}
