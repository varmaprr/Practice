package com.varma.ds.greedy;

import java.util.stream.IntStream;

/**
 * Created by varma on 3/10/2018.
 */
public class SmallestNumbersWithGivenSum {

    public static void main(String[] args) {

        int s = 18, d = 2;

        findSmallestSum(s, d);

    }

    private static void findSmallestSum(int s, int d) {

        if (s == 0) {
            System.out.println((d == 1) ? 0 : -1);
            return;
        }

        if (s > 9 * d) {
            System.out.println(-1);
            return;
        }

        int[] res = new int[d];

        s -= 1;

        for (int i = d - 1; i > 0; i--) {
            if (s > 9) {
                s -= 9;
                res[i] = 9;
            } else {
                res[i] = s;
                s = 0;
            }
        }

        res[0] = s + 1;

        IntStream.range(0, d).forEach(i -> System.out.print(res[i]));

    }
}
