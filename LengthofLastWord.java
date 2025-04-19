import java.util.Scanner;

public class LengthofLastWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        scanner.close();
        System.out.println("\nString is: " + str);

        int ans = lengthofLastWord(str);
        System.out.println("-> Length of last word is: " + ans);

    }

    public static int lengthofLastWord(String str) {
        int i = str.length() - 1;
        int count = 0;
        while (i >= 0 && str.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && str.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}
