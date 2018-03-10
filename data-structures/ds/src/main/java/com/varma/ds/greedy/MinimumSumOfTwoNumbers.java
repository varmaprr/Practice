package com.varma.ds.greedy;

import java.util.PriorityQueue;
import java.util.stream.IntStream;

/**
 * Created by varma on 3/10/2018.
 */
public class MinimumSumOfTwoNumbers {

    public static void main(String[] args) {
        int[] arr = {6, 8, 4, 5, 2, 3};

        System.out.println(minimumSumOfTwoNumbers(arr));
    }

    private static long minimumSumOfTwoNumbers(int[] arr) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        IntStream.range(0, arr.length).forEach(i -> pq.add(arr[i]));

        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();

        while (!pq.isEmpty()) {
            str1.append(pq.poll());
            if (!pq.isEmpty()) ;
            str2.append(pq.poll());
        }

        return Long.parseLong(str1.toString()) + Long.parseLong(str2.toString());
    }
}
