package January.jan_20.GeeksforGeeks;

public class LongestSubarraySum {
    public static void main(String[] args) {
        /*
         * Given an array arr[] containing integers and an integer k, your task is to
         * find the length of the longest subarray where the sum of its elements is
         * equal to the given value k. If there is no subarray with sum equal to k,
         * return 0.
         * 
         * Examples:
         * 
         * Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
         * Output: 6
         * Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2,
         * 7, 1, -10]. The length of the longest subarray with a sum of 15 is 6.
         * Input: arr[] = [-5, 8, -14, 2, 4, 12], k = -5
         * Output: 5
         * Explanation: Subarrays with sum = -5 are [-5] and [-5, 8, -14, 2, 4]. The
         * length of the longest subarray with a sum of -5 is 5.
         * Input: arr[] = [10, -10, 20, 30], k = 5
         * Output: 0
         * Explanation: No subarray with sum = 5 is present in arr[].
         */

        int[] arr = { -5, 8, -14, 2, 4, 12 };
        int k = -5;
        System.out.println(longestSubarray(arr, k));
    }

    static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;

        for (int start = 0; start < n; start++) {
            int sum = 0;

            for (int end = start; end < n; end++) {
                sum += arr[end];

                if (sum == k) {
                    maxLen = Math.max(maxLen, end - start + 1);
                }
            }
        }
        return maxLen;
    }
}
