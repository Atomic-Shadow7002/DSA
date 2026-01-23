package January.jan_23.geeksforgeeks;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        int k = 4;
        System.out.println(kthSmallest(arr, k));
    }

    static int kthSmallest(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        k = k - 1;

        while (left <= right) {
            int pivot = arr[right];
            int i = left;

            for (int j = left; j < right; j++) {
                if (arr[j] <= pivot) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                }
            }

            int temp = arr[i];
            arr[i] = arr[right];
            arr[right] = temp;

            if (i == k) {
                return arr[i];
            } else if (i > k) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }
        return -1;
    }

}
