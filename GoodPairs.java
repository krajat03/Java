import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int array[] = new int[size];
        System.out.println("Enter elements of array:- ");
        arrayInput(array, scanner);

        System.out.print("Array is: \n-> ");
        arrayOutput(array);

        int ans = goodPairs(array);
        if (ans == 0) {
            System.out.println("-> having no good pairs");
        } else {
            System.out.println("-> " + "having " + ans + " good pairs");
        }

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

    public static int goodPairs(int array[]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}
