import java.util.HashMap;
import java.util.Scanner;

public class HashingCharwithMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Enter a string: ");
        String s = scanner.next();

        char[] str = s.toCharArray();

        // pre-compute
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            map.put(str[i], map.getOrDefault(str[i], 0) + 1);
        }

        System.out.println("-> Frequencies are:- ");
        for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        scanner.close();
    }
}
