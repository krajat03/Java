import java.util.Scanner;

public class ReversePrefixString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter string: ");
        String word = scanner.nextLine();
        System.out.print("-> Enter prefix letter: ");
        char prefix = scanner.next().charAt(0);
        scanner.close();
        System.out.println("\n-> Before reversing: " + word);

        String rev = reversePrefixString(word, prefix);

        System.out.println("-> After reversing: " + rev);

    }

    static String reversePrefixString(String word, char prefix) {
        int st = 0;
        int e = word.indexOf(prefix);

        if (e == -1) {
            return word;
        }
        
        char[] chars = word.toCharArray();
        while (st < e) {
            char temp = chars[st];
            chars[st++] = chars[e];
            chars[e--] = temp;
        }

        return new String(chars);
    }
}
