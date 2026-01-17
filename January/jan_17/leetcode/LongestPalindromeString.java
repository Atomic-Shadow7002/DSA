package January.jan_17.leetcode;

public class LongestPalindromeString {
    public static void main(String[] args) {
        /*
         * Given a string s, return the longest palindromic substring in s.
         *
         * Example 1:
         * 
         * Input: s = "babad"
         * Output: "bab"
         * Explanation: "aba" is also a valid answer.
         * Example 2:
         * 
         * Input: s = "cbbd"
         * Output: "bb"
         */

        String s = "babad";
        System.out.println(longestPalindrome(s));

    }

    static String longestPalindrome(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd length
            int left = i, right = i;
            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > ans.length()) {
                    ans = s.substring(left, right + 1);
                }
                left--;
                right++;
            }

            // Even length
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > ans.length()) {
                    ans = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }

        return ans;
    }

}
