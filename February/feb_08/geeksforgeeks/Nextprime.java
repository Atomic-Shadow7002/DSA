package February.feb_08.geeksforgeeks;

public class Nextprime {
    public static void main(String[] args) {
        /*
         * Given an integer n. Write a program to find the first prime number greater
         * than n.
         * 
         * Examples:
         * 
         * Input: n = 15
         * Output: 17
         * Explanation: 17 is next prime number.
         * Input: n = 7
         * Output: 11
         * Explanation: 11 is the prime number next to 7.
         */

        int n = 15;
        System.out.println(nextPrime(n));

    }

    public static int nextPrime(int n) {

        int num = n + 1;

        while (true) {
            if (isPrime(num)) {
                return num;
            }
            num++;
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
