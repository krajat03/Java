import java.util.Scanner;

public class Hashing1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = ArrayFunctions.createArray(scanner);

        ArrayFunctions.arrayInput(arr, scanner);

        ArrayFunctions.arrayOutput(arr);

        // pre-compute
        int max = -1;
        for (int i : arr) {
            max = Math.max(i, max);
        }

        int[] hash = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        System.out.println("Frequencies are:- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + hash[arr[i]]);
        }
    }
}
