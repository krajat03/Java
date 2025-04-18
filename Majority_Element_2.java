import java.util.Scanner;
import java.util.Arrays;
public class Majority_Element_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Enter elements of array:- ");
        arrayInput(array, scanner);

        System.out.println("Array is:- ");
        arrayOutput(array);
        int ans = majorityElement(array);
        System.out.println("-> Majority element is: " + ans);
    }

    public static int[] arrayInput(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void arrayOutput(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int majorityElement(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
