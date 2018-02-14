package com.varma.ds.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Largest sub array with equal number of 0s and 1s
 * https://www.geeksforgeeks.org/largest-subarray-with-equal-number-of-0s-and-1s/
 * Created by varma on 2/14/2018.
 */
public class LargestSubArray {

    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 1, 1, 0, 0};
        int max_len = 0;
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            int oneCount = 0, zeroCount = 0, cur_len = 0;
            if (arr[i] == 1)
                oneCount++;
            else
                zeroCount++;
            cur_len++;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == 1)
                    oneCount++;
                else
                    zeroCount++;
                cur_len++;
                if (oneCount == zeroCount && cur_len > max_len) {
                    list.add(i);
                    max_len = cur_len;
                }
            }


        }
        list.forEach(e -> System.out.println("k: " + e + " v: " + (e+2)));
        System.out.println(max_len);
    }
}
