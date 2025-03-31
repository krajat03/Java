import java.util.Scanner;

public class Merge_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter String1: ");
        String string1 = scanner.nextLine();
        System.out.print("-> Enter String2: ");
        String string2 = scanner.nextLine();
        scanner.close();

        String result = mergeStrings(string1, string2);
        System.out.println("=> Merged String is: " + result);

    }

    public static String mergeStrings(String string1, String string2) {
        int i = 0, j = 0;
        String result = "";

        while (i < string1.length() && j < string2.length()) {
            result += string1.charAt(i++);
            result += string2.charAt(j++);
        }
        while (i < string1.length()) {
            result += string1.charAt(i++);
        }
        while (j < string2.length()) {
            result += string2.charAt(j++);
        }
        return result;
    }
}
