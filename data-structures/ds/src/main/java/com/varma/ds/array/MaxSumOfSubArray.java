package com.varma.ds.array;

/**
 * Created by varma on 2/16/2018.
 */
public class MaxSumOfSubArray {

    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(findMaxSum(a));

    }

    private static int findMaxSum(int[] a) {

        int maxSum = 0, currentMaxSum = 0;

        for (int i = 0; i < a.length; i++) {
            currentMaxSum = currentMaxSum + a[i];
            if (currentMaxSum < 0)
                currentMaxSum = 0;
            if (currentMaxSum > maxSum)
                maxSum = currentMaxSum;
        }

        return maxSum;
    }
}
