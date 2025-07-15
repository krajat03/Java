import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(array, scanner);

        ArrayFunctions.arrayOutput(array);

        int missingNum = missingNumber(array);
        System.out.println("Missing number is: " + missingNum);
    }

    static int missingNumber(int[] array) {
        int actualSum = 0;
        int n = array.length;
        for (int num : array) {
            actualSum += num;
        }

        int expectedSum = n * (n + 1) / 2;

        return expectedSum - actualSum;
    }
}
