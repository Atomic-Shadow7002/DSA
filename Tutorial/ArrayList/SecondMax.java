package Tutorial.ArrayList;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 45, 76, 89 };
        secondMax(arr);
        System.out.println(secondMax(arr));
    }

    static int secondMax(int[] arr) {
        int maxVal = arr[0];
        int secondMaxVal = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                secondMaxVal = maxVal;
                maxVal = arr[i];
            } else if (arr[i] > maxVal && secondMaxVal < maxVal) {
                maxVal = arr[i];
            }
        }
        return secondMaxVal;
    }
}
