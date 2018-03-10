package com.varma.ds.greedy;

/**
 * Created by varma on 3/10/2018.
 */
public class MinimumNoOfSquares {

    public static void main(String[] args) {
        //int l = 13, b = 29;
        int l = 4, b = 5;

        System.out.println(minimumNoOfSquares(l, b));
    }

    private static int minimumNoOfSquares(int a, int b) {

        if (a < b) {
            swap(a, b);
        }

        int res = 0, rem;

        while (b > 0) {
            res += a / b;
            rem = a % b;
            a = b;
            b = rem;
        }

        return res;
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
