import java.util.Scanner;

public class CountEqual_DivisiblePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        scanner.close();

        int ans = countPairs(array, k);
        System.out.println("-> " + ans);
    }

    public static int countPairs(int[] array, int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int product = i * j;
                if (array[i] == array[j] && product % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
