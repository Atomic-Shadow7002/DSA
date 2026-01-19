package January.jan_19.geeksforgeeks;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 1, 3, 5, 1 };
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int arr[]) {
        int count = 0;
        int candidate = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        }

        return -1;
    }
}
