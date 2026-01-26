package January.jan_25.geeksforgeeks;

import java.util.ArrayList;

public class MissingRepeating {
    public static void main(String[] args) {
        /*
         * Given an unsorted array arr[] of size n, containing elements from the range 1
         * to n, it is known that one number in this range is missing, and another
         * number occurs twice in the array, find both the duplicate number and the
         * missing number.
         * 
         * Examples:
         * 
         * Input: arr[] = [2, 2]
         * Output: [2, 1]
         * Explanation: Repeating number is 2 and the missing number is 1.
         * Input: arr[] = [1, 3, 3]
         * Output: [3, 2]
         * Explanation: Repeating number is 3 and the missing number is 2.
         * Input: arr[] = [4, 3, 6, 2, 1, 1]
         * Output: [1, 5]
         * Explanation: Repeating number is 1 and the missing number is 5.
         * Constraints:
         * 2 ≤ n ≤ 106
         * 1 ≤ arr[i] ≤ n
         */

        int[] arr = { 4, 3, 6, 2, 1, 1 };
        System.out.println(findTwoElement(arr));

    }

    static ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        int currSum = 0;

        int repeatNum = -1;
        int missNum = -1;

        int[] count = new int[n + 1];

        for (int i = 0; i < n; i++) {
            currSum = currSum + arr[i];
            count[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                repeatNum = i;
            }
            if (count[i] == 0) {
                missNum = i;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeatNum);
        result.add(missNum);

        return result;
    }
}
