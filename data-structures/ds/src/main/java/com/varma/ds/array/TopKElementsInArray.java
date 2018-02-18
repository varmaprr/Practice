package com.varma.ds.array;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by varma on 2/18/2018.
 */
public class TopKElementsInArray {

    public static void main(String[] args) {

        int[] arr = {5, 6, 4, 1, 2};

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        Arrays.stream(arr).forEach(i -> treeSet.add(i));

        IntStream.range(0, 3).forEach(i -> System.out.print(treeSet.pollFirst() + " "));
    }
}
