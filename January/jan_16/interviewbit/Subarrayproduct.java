package January.jan_16.interviewbit;

public class Subarrayproduct {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };

        int result = maxProduct(arr);

        System.out.println("Maximum product subarray = " + result);
    }

    static int maxProduct(int[] arr) {
        if (arr.length == 0)
            return 0;

        int maxEnding = arr[0];
        int minEnding = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];

            if (curr < 0) {
                int temp = maxEnding;
                maxEnding = minEnding;
                minEnding = temp;
            }

            maxEnding = Math.max(curr, maxEnding * curr);
            minEnding = Math.min(curr, minEnding * curr);

            maxSoFar = Math.max(maxSoFar, maxEnding);
        }

        return maxSoFar;
    }

}
