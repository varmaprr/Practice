package com.varma.ds.interview;

import java.util.*;

/**
 * Created by varma on 3/15/2018.
 * An array of integers, arr, of size n is defined as {}. You will be given an array of integers to sort. Sorting must first by frequency of occurrence, then by value.
 * For instance, given an array [4,5,6, 5, 4, 3] there is one each of 6's and 3's and there are two 4's and 5's. The sorted list is [3,6,4,4,5,5]
 */
public class SortAnArrayByOccurrenceAndThenValue {

    /*
     * Complete the function below.
     */
    static void customSort(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap();

        Arrays.stream(arr).forEach(i -> {
            Integer count = map.get(i);
            if (count != null) {
                map.put(i, ++count);
            } else {
                map.put(i, 1);
            }
        });

        List<Integer> resultSet = new ArrayList();

        List<Integer> subSets;

        for (int i = 1; i < arr.length; i++) { // frequency
            subSets = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                if (map.get(arr[j]) == i) {
                    subSets.add(arr[j]);
                }
            }
            Collections.sort(subSets);

            resultSet.addAll(subSets);
        }

        resultSet.forEach(i -> {
           /* int count = map.get(i);
            IntStream.range(0, count).forEach(j -> System.out.println(i));*/
            System.out.println(i);
        });
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr_size = 0;
        arr_size = Integer.parseInt(in.nextLine().trim());

        int[] arr = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            int arr_item;
            arr_item = Integer.parseInt(in.nextLine().trim());
            arr[i] = arr_item;
        }

        customSort(arr);

    }

}
