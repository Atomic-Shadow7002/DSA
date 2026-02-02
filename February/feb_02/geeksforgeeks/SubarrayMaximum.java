import java.util.ArrayList;

public class SubarrayMaximum {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        System.out.println(maxOfSubarrays(arr, k));
    }

    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        int max = arr[0];
        for (int i = 1; i < k; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        result.add(max);

        for (int i = k; i < n; i++) {
            int outgoing = arr[i - k];
            int incoming = arr[i];

            if (outgoing == max) {
                max = arr[i - k + 1];
                for (int j = i - k + 1; j <= i; j++) {
                    if (arr[j] > max)
                        max = arr[j];
                }
            } else {
                if (incoming > max)
                    max = incoming;
            }

            result.add(max);
        }

        return result;
    }
}
