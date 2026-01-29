package January.jan_29.leetcode;

import java.util.*;

public class MinCostString {
    public static void main(String[] args) {
        String source = "abcd";
        String target = "acbe";
        char[] original = { 'a', 'b', 'c', 'c', 'e', 'd' };
        char[] changed = { 'b', 'c', 'b', 'e', 'b', 'e' };
        int[] cost = { 2, 5, 5, 1, 2, 20 };
        System.out.println((minimumCost(source, target, original, changed, cost)));
    }

    public static long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {

        final long INF = (long) 1e18;
        int n = 26;

        long[][] dist = new long[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for (int i = 0; i < original.length; i++) {
            int u = original[i] - 'a';
            int v = changed[i] - 'a';
            dist[u][v] = Math.min(dist[u][v], cost[i]);
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] < INF && dist[k][j] < INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        long totalCost = 0;

        for (int i = 0; i < source.length(); i++) {
            int s = source.charAt(i) - 'a';
            int t = target.charAt(i) - 'a';

            if (s == t)
                continue;

            if (dist[s][t] == INF)
                return -1;

            totalCost += dist[s][t];
        }

        return totalCost;
    }
}
