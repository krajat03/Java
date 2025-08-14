import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter size of string array: ");
        int size = scanner.nextInt();

        String[] strs = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("-> Enter element: ");
            String s = scanner.next();
            strs[i] = s;
        }

        List<List<String>> ans = new ArrayList<>();
        ans = groupAnagrams(strs);

        for (var values : ans) {
            System.out.println(values);
        }
        scanner.close();
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] ch = s.toCharArray();

            Arrays.sort(ch);
            String key = new String(ch);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
