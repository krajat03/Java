import java.util.Scanner;

public class GetUniqueEle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayFunctions.createArray(scanner);
        ArrayFunctions.arrayInput(array, scanner);
        ArrayFunctions.arrayOutput(array);

        int unique = getUnique(array);
        System.out.println("-> Unique element is: " 
        + unique);

    }

    static int getUnique(int[] array){
        int ans = 0;
        for (int num : array) {
            ans = ans ^ num;
        }
        return ans;
    }
}
