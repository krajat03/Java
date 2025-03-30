import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements: ");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int ans = getSingleNumber(array);
        System.out.println("\n-> Single number is: " + ans);

    }

    public static int getSingleNumber(int[] array) {
        int num = 0;
        for (int i : array) {
            num ^= i;
        }
        return num;
    }
}
