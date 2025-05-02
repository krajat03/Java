import java.util.Scanner;

public class SortArrayParity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);

        ArrayFunctions.arrayOutput(array);

        sortArrayParity(array);
        ArrayFunctions.arrayOutput(array);

    }

    public static void sortArrayParity(int[] array) {
        int s = 0, e = array.length - 1;

        while (s < e) {
            if (array[s] % 2 > array[e] % 2) {
                int temp = array[s];
                array[s] = array[e];
                array[e] = temp;
            }

            if (array[s] % 2 == 0)
                s++;
            if (array[e] % 2 != 0)
                e--;
        }
    }
    
}
