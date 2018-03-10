package com.varma.ds.dp;

import java.util.Arrays;

/**
 * Created by varma on 3/10/2018.
 */
public class MinimumPlatforms {


    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.print(minimumNoOfPlatforms(arrival, departure));
    }

    private static int minimumNoOfPlatforms(int[] a, int[] d) {
        Arrays.sort(a);
        Arrays.sort(d);

        int required_platform = 1, result = 1;
        int i = 1, j = 0;

        while (i < a.length && j < d.length) {
            if (a[i] < d[j]) {
                required_platform++;
                i++;

                if (required_platform > result)
                    result = required_platform;
            } else {
                required_platform--;
                j++;
            }
        }

        return result;
    }
}
