import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randInt = rand.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("***** Guess number between (1 to 100) *****");
        while (true) {
            System.out.print("Enter number: ");
            int num = scanner.nextInt();
            attempts++;
            if (num < randInt) {
                System.out.println("-> Low! Try a higher number ");
            } else if (num > randInt) {
                System.out.println("-> High! Try a lower number ");
            } else {
                System.out.println("🎉 Congratulations! Guessed in " + attempts + " attempts!");
                break;
            }
        }
        scanner.close();
    }
}
