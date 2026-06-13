import java.util.ArrayList;

public class Mask2 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = i; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            list.add(max);
        }

        System.out.println(list);
    }
}
