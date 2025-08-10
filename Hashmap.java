import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        // Creation
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion - put
        map.put("India", 120);
        map.put("USA", 140);
        map.put("China", 110);
        map.put("Russia", 130);

        System.out.println(map);

        // Search -> key' value
        if (map.containsKey("India")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Search -> key
        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        // Get key value - .get
        System.out.println(map.get("India"));
        System.out.println(map.get("Nepal")); // not present in the map

        // Remove
        map.remove("China");
        System.out.println(map);
    }
}
