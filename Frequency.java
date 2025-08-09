import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);

        ArrayFunctions.arrayOutput(array);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int val = 0;

        for (var entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                val = entry.getKey();
            }
        }

        System.out.println("-> Element with maximum frequency is: " + val);
    }
}
