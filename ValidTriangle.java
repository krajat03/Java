// Problem Statement:
// -> Given an integer array nums, return the number of triplets chosen from the
// -> array that can make triangles if we take them as side lengths of a triangle.

import java.util.*;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        ArrayFunctions.arrayInput(nums, sc);

        int count = triangleNumber(nums);

        System.out.println("Total possible triangles are: " + count);
    }

    private static int triangleNumber(int[] nums) {
        int count = 0;

        Arrays.sort(nums);

        int n = nums.length;

        for (int k = n - 1; k >= 0; k--) {
            int i = 0, j = k - 1;

            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += (j - i);
                    j--;
                } else
                    i++;
            }
        }
        return count;
    }
}
