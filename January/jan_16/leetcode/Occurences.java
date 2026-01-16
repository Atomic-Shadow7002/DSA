package January.jan_16.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Occurences {
    public static void main(String[] args) {
        /*
         * For each queries[i], you need to find the index of the queries[i]th
         * occurrence of x in the nums array. If there are fewer than queries[i]
         * occurrences of x, the answer should be -1 for that query.
         * 
         * Example 1:
         * 
         * Input: nums = [1,3,1,7], queries = [1,3,2,4], x = 1
         * 
         * Output: [0,-1,2,-1]
         * 
         * Explanation:
         * 
         * For the 1st query, the first occurrence of 1 is at index 0.
         * For the 2nd query, there are only two occurrences of 1 in nums, so the answer
         * is -1.
         * For the 3rd query, the second occurrence of 1 is at index 2.
         * For the 4th query, there are only two occurrences of 1 in nums, so the answer
         * is -1.
         * Example 2:
         * 
         * Input: nums = [1,2,3], queries = [10], x = 5
         * 
         * Output: [-1]
         * 
         * Explanation:
         * 
         * For the 1st query, 5 doesn't exist in nums, so the answer is -1.
         */

        int[] nums = { 1, 3, 1, 7 };
        int[] queries = { 1, 3, 2, 4 };
        int x = 1;

        System.out.println(Arrays.toString(occurrencesOfElement(nums, queries, x)));

    }

    static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                output.add(i);
            }
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            if (queries[i] > output.size()) {
                result[i] = -1;
            } else {
                result[i] = output.get(queries[i] - 1);
            }
        }

        return result;
    }

}
