package January.jan_26.geeksforgeeks;

import java.util.Arrays;

public class PerfectSum {
    public static void main(String[] args) {
        /*
         * Given an array arr of non-negative integers and an integer target, the task
         * is to count all subsets of the array whose sum is equal to the given target.
         * 
         * Examples:
         * 
         * Input: arr[] = [5, 2, 3, 10, 6, 8], target = 10
         * Output: 3
         * Explanation: The subsets {5, 2, 3}, {2, 8}, and {10} sum up to the target 10.
         * Input: arr[] = [2, 5, 1, 4, 3], target = 10
         * Output: 3
         * Explanation: The subsets {2, 1, 4, 3}, {5, 1, 4}, and {2, 5, 3} sum up to the
         * target 10.
         * Input: arr[] = [5, 7, 8], target = 3
         * Output: 0
         * Explanation: There are no subsets of the array that sum up to the target 3.
         * Input: arr[] = [35, 2, 8, 22], target = 0
         * Output: 1
         * Explanation: The empty subset is the only subset with a sum of 0.
         */

        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 10;
        System.out.println(perfectSum(arr, target));
    }

    static int perfectSum(int[] nums, int target) {
        int n = nums.length;

        int[] dp = new int[target + 1];
        dp[0] = 1; // empty subset

        for (int num : nums) {
            // traverse backwards to avoid reuse of same element
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] + dp[j - num];
            }
        }

        return dp[target];
    }

}
