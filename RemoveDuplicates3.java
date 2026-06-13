import java.util.Scanner;

public class RemoveDuplicates3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = ArrayFunctions.createArray(scanner);

        System.out.println("Enter elements in sorted order:- ");
        ArrayFunctions.arrayInput(arr, scanner);

        ArrayFunctions.arrayOutput(arr);

        int ans = removeDuplicates(arr);

        System.out.println("-> Total unique elements are: " + ans);
    }

    static int removeDuplicates(int[] arr) {
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
}
