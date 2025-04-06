import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        arrayInput(array, size, scanner);
        arrayOutput(array);
        int majorityElement = majorityElement(array, size);
        if (majorityElement == -1) {
            System.out.println("-> No majority element exist");
        } else {
            System.out.println("-> Majority element is: " + majorityElement);
        }
    }

    public static void arrayInput(int[] array, int size, Scanner scanner) {
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("-> Enter element: ");
            array[i] = scanner.nextInt();
        }
    }

    public static void arrayOutput(int[] array) {
        System.out.println("Array is: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int majorityElement(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > size / 2) {
                return array[i];
            }
        }
        return -1;
    }
}