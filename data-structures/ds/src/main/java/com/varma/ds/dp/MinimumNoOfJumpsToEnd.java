package com.varma.ds.dp;

import java.util.stream.IntStream;

/**
 * Created by varma on 3/10/2018.
 */
public class MinimumNoOfJumpsToEnd {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 2, 2, 6, 1, 6, 8, 9};

        int[] r = new int[arr.length];

        int result = minimumNoOfjumps(arr,r);

        System.out.println(result);
    }

    private static int minimumNoOfjumps(int[] arr, int[] r) {
        int[] jump = new int[arr.length];
        jump[0] = 0;

        IntStream.range(1, arr.length).forEach(i -> jump[i] = Integer.MAX_VALUE-1);

        for(int i=1; i < arr.length ; i++){
            for(int j=0; j <i ; j++){
                if(arr[j]+j>=i){
                    if(jump[i]>jump[j]+1){
                        r[i]=j;
                        jump[i]=jump[j]+1;
                    }
                }
            }
        }

        return jump[jump.length-1];
    }
}
