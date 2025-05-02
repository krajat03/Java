import java.util.Scanner;

public class ApplyOperationOnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);

        ArrayFunctions.arrayOutput(array);

        applyOperationOnArray(array);
        System.out.print("After operations ");
        ArrayFunctions.arrayOutput(array);

    }

    public static void applyOperationOnArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                array[i] *= 2;
                array[i + 1] = 0;
            }
        }

        int idx = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[idx++] = array[i];
            }
        }

        while (idx < array.length) {
            array[idx++] = 0;
        }

    }
}
