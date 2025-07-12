import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {

        // Creation
        HashSet<Integer> set = new HashSet<>();

        // Insertion - add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Print set
        System.out.println(set);

        // Search - contains
        if (set.contains(2)) {
            System.out.println("-> Set contains 2");
        }

        // Delete - remove
        set.remove(2);
        if (!set.contains(2)) {
            System.out.println("-> 2 is deleted");
        }

        // Size
        System.out.println("-> Size: " + set.size());
    }
}
