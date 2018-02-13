package com.varma.ds.array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by varma on 2/13/2018.
 */
public class FirstNonRepeatedNumber {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};

        final Map<Integer, Integer> linkedHM = new LinkedHashMap();

        Arrays.stream(arr).forEach(i -> {
            if (linkedHM.containsKey(i))
                linkedHM.put(i, linkedHM.get(i) + 1);
            else
                linkedHM.put(i, 1);
        });

        Set<Map.Entry<Integer, Integer>> set = linkedHM.entrySet();

        for (Map.Entry<Integer, Integer> t : set) {
            if (t.getValue() == 1) {
                System.out.print(t.getKey());
                break;
            }
        }
    }

}
