package January.jan_13.codechef;

import java.util.Arrays;
import java.util.Scanner;

public class OddOneOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] dolls = new int[N];

            for (int i = 0; i < N; i++) {
                dolls[i] = sc.nextInt();
            }

            Arrays.sort(dolls);

            int answer = 0;

            for (int i = 0; i < dolls.length - 1; i += 2) {
                if (dolls[i] != dolls[i + 1]) {
                    answer = dolls[i];
                    break;
                }
            }

            if (answer == 0) {
                answer = dolls[dolls.length - 1];
            }

            System.out.println(answer);
            T--;
        }
    }
}
