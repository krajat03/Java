import java.util.Scanner;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int size = scanner.nextInt();

        int array[] = new int[size];
        System.out.println("Enter prices:- ");
        arrayInput(array, scanner);

        System.out.print("Prices are:- \n-> ");
        arrayOutput(array);

        int maxProfit = maxProfit(array);
        System.out.println("-> Maximum profit is: " + maxProfit);

    }

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
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

}
