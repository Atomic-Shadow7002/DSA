package January.jan_11.leetcode;

import java.util.ArrayList;
import java.util.List;

public class duplicate {
    public static void main(String[] args) {
        // Find all Duplicates in an Array
        // Input: nums = [4,3,2,7,8,2,3,1]
        // Output: [2,3]

        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int value = Math.abs(nums[i]);
            int index = value - 1;

            if (nums[index] < 0) {
                duplicates.add(value);
            } else {
                nums[index] = -nums[index];
            }

        }
        System.out.println(duplicates);
    }
}
