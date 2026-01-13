package January.jan_12.geeksforgeeks;

public class reverseString {
    public static void main(String[] args) {

        int[] arr = { 12, 35, 1, 10, 34, 1 };
        if (arr.length < 2) {
            System.out.println(-1);
            ;
        }

        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }
}
