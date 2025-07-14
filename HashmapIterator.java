import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapIterator {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("USA", 140);
        map.put("China", 110);
        map.put("Russia", 130);

        System.out.println("****** First Method ******");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + ", ");
            System.out.println(e.getValue());
        }

        System.out.println("\n****** Second Method ******");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ", " + map.get(key));
        }

    }
}
