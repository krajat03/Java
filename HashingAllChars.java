import java.util.Scanner;

public class HashingAllChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter a string: ");
        String s = scanner.next();

        char[] str = s.toCharArray();

        // pre-compute
        int hash[] = new int[256];
        for (int i = 0; i < str.length; i++) {
            hash[str[i]]++;
        }

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i] + " -> " + hash[str[i]]);
        }

        scanner.close();
    }
}
