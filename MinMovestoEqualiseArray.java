import java.util.Arrays;
import java.util.Scanner;

public class MinMovestoEqualiseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = ArrayFunctions.createArray(scanner);
        ArrayFunctions.arrayInput(array, scanner);
        ArrayFunctions.arrayOutput(array);

        int ans = minMoves(array);
        System.out.println("-> " + ans + " moves");
    }

    static int minMoves(int[] array) {
        int size = array.length;
        Arrays.sort(array);

        int midEle = array[size / 2];
        int ans = 0;
        for (int i = 0; i < size; i++) {
            ans += Math.abs(midEle - array[i]);
        }

        return ans;
    }
}
