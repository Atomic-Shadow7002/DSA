package January.jan_19.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 132;

        int result = 0;
        while (x != 0) {
            int rem = x % 10;
            x = x / 10;

            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && rem > 7)) {
                System.out.println(0);
            }

            if (result < Integer.MIN_VALUE / 10 ||
                    (result == Integer.MIN_VALUE / 10 && rem < -8)) {
                System.out.println(0);
            }

            result = result * 10 + rem;
        }

        System.out.println(result);
    }
}
