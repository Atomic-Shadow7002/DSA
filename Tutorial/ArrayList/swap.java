package Tutorial.ArrayList;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 45, 76, 89 };
        swapNum(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swapNum(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
