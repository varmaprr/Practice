package com.varma.ds.dp;

/**
 * Created by varma on 2/19/2018.
 */
public class LongestCommonSubSequence {


    private static int LCS(char[] X, char[] Y, int m, int n) {

        if (m == 0 || n == 0)
            return 0;

        if (X[m - 1] == Y[n - 1])
            return 1 + LCS(X, Y, m - 1, n - 1);

        else
            return max(LCS(X, Y, m, n - 1), LCS(X, Y, m - 1, n));
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {

        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();

        int m = X.length;
        int n = Y.length;

        System.out.print(LCS(X, Y, m, n));
    }
}
