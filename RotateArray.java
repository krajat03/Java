import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int array[] = new int[size];
        System.out.println("Enter elements of array:- ");
        arrayInput(array, scanner);

        System.out.print("Enter rotation position: ");
        int key = scanner.nextInt();
        scanner.close();

        System.out.print("Array is: \n-> ");
        arrayOutput(array);

        array = rotateArray(array, key);
        System.out.print("Rotated array is: \n-> ");
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

    public static int[] rotateArray(int arr[], int key) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[(i + key) % arr.length] = arr[i];
        }
        return temp;
    }

}
