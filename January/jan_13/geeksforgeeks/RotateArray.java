package January.jan_13.geeksforgeeks;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        /*
         * Given an array arr[]. Rotate the array to the left (counter-clockwise
         * direction) by d steps, where d is a positive integer. Do the mentioned change
         * in the array in place.
         * 
         * Input: arr[] = [1, 2, 3, 4, 5], d = 2
         * Output: [3, 4, 5, 1, 2]
         * Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
         * Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
         * Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
         * Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4
         * 6.
         * Input: arr[] = [7, 3, 9, 1], d = 9
         * Output: [3, 9, 1, 7]
         * Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.
         */

        int[] arr = { 7, 3, 9, 1 };
        int n = arr.length;
        int d = 9;
        if (d > n) {
            d = d % n;
        }
        rotate(arr, 0, n - 1);
        rotate(arr, 0, n - d - 1);
        rotate(arr, n - d, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

}
