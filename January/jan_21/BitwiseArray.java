package January.jan_21;

import java.util.*;

public class BitwiseArray {

    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int val = nums.get(i);

            if ((val & 1) == 0) {
                ans[i] = -1;
                continue;
            }

            int temp = val;
            int trailingOnes = 0;
            while ((temp & 1) == 1) {
                trailingOnes++;
                temp >>= 1;
            }

            ans[i] = val - (1 << (trailingOnes - 1));
        }

        return ans;
    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2, 3, 5, 7);

        BitwiseArray solution = new BitwiseArray();
        int[] result = solution.minBitwiseArray(nums);

        System.out.println("Input: " + nums);
        System.out.print("Output: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
