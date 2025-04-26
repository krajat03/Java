import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Enter elements of array:- ");
        arrayInput(array, scanner);

        System.out.println("Array is:- ");
        arrayOutput(array);

        moveZeros(array);

        System.out.println("After moving all zeros array is:- ");
        arrayOutput(array);
    }

    static void moveZeros(int[] array) {
        int i = 0, j = 1;
        while (i < j && i < array.length && j < array.length) {
            if (array[i] == 0 && array[j] != 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            } else if (array[i] == 0 && array[j] == 0) {
                j++;
            } else {
                i++;
                j++;
            }
        }
    }

    static void arrayOutput(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int[] arrayInput(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
