import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class MajorityElementII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> nums = new Vector<>();
        System.out.print("Enter size of vector: ");
        int size = scanner.nextInt();
        System.out.println("Enter elements:- ");
        for (int index = 0; index < size; index++) {
            nums.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println("Vector is: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        Vector<Integer> ans = majorityElement(nums);
        System.out.println("Vector is: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static Vector<Integer> majorityElement(Vector<Integer> nums) {
        Vector<Integer> ans = null;
        int size = nums.size() / 3;
        int count = 0;
        int candidate = 0;
        Collections.sort(nums);

        for (int num : nums) {
            if (count == 0)
                candidate = num;
            if (num == candidate && count == size) {
                ans.add(candidate);
                count = 0;
            } else if (num == candidate && count < size)
                count++;
            else if (num != candidate)
                count--;
        }
        return ans;
    }
}
