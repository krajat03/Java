import java.util.Scanner;

public class ReverseArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Enter elements of array:- ");
        arrayInput(array, scanner);

        System.out.println("Array is:- ");
        arrayOutput(array);

        reverse(array);

        System.out.println("After reversing array is:- ");
        arrayOutput(array);

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

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int rev = 0;
            while (temp != 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }
            array[i] = rev;
        }
    }
}
