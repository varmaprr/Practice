package com.varma.ds.array;

/**
 * Search in sorted and rotated array.
 * https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 * Created by varma on 2/15/2018.
 */
public class SearchInSortedRotatedArray {

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 1, 2};

        int given = 1;


        if (arr[0] <= given) {
            int prev = arr[0];
            for (int i = 1; prev <= arr[i] && i < arr.length; i++) {
                prev = arr[i];
                if (given == arr[i]) {
                    System.out.print("Position :" + i);
                    return;
                }
            }
        }else {
            int prev = arr[arr.length-1];
            for(int i=arr.length-2; i>0 && prev >= arr[i] ; i--){
                prev = arr[i];
                if(given == arr[i]){
                    System.out.print("Position :" + i);
                    return;
                }
            }
        }


    }
}
