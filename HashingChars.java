import java.util.Scanner;

public class HashingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter a string: ");
        String s = scanner.next();

        char[] str = s.toCharArray();

        // pre-compute
        int hash[] = new int[26];
        for (int i = 0; i < str.length; i++) {
            hash[str[i] - 'a']++;
        }

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i] + " -> " + hash[str[i] - 'a']);
        }

        scanner.close();
    }
}
