import java.util.HashSet;
import java.util.Scanner;

public class MissingNumberII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);

        ArrayFunctions.arrayOutput(array);

        int missingNum = missingNumber(array);
        System.out.println("Missing number is: " + missingNum);

    }

    static int missingNumber(int[] array) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {
            set.add(num);
        }

        for (int i = 0; i <= array.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
