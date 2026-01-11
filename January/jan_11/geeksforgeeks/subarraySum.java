package January.jan_11.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class subarraySum {
    public static void main(String[] args) {

        // Indexes of Subarray Sum
        // Input: arr[] = [1, 2, 3, 7, 5], target = 12
        // Output: [2, 4]
        // Explanation: The sum of elements from 2nd to 4th position is 12.

        int[] nums = { 1, 2, 3, 7, 5 };
        int target = 12;
        int sum = 0;
        int start = 0;
        List<Integer> result = new ArrayList<>();
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum > target) {
                sum -= nums[start];
                start++;
            }

            if (sum == target) {
                result.add(start + 1);
                result.add(end + 1);
                break;
            }
        }
        System.out.println(result);
    }
}
