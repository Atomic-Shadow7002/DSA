package January.jan_12.leetcode;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        // Example 1:

        // Input: s = "the sky is blue"
        // Output: "blue is sky the"
        // Example 2:

        // Input: s = " hello world "
        // Output: "world hello"
        // Explanation: Your reversed string should not contain leading or trailing
        // spaces.

        String s = " hello world ";
        System.out.println(reverse(s));
        ;

    }

    public static String reverse(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        System.out.println(Arrays.toString(words));
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");

            }
        }
        return result.toString();
    }
}
