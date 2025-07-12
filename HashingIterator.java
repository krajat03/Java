import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashingIterator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        // add
        while (set.size() < 5) {
            int num = scanner.nextInt();
            set.add(num);
        }

        scanner.close();

        Iterator<Integer> it = set.iterator();

        System.out.println(set);

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
