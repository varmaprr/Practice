package com.varma.ds.interview;

import java.io.BufferedInputStream;
import java.util.*;

/**
 * Created by varma on 4/13/2018.
 * This question was asked in workfusion interview
 */
public class StringAndSortedNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String inputStr = in.nextLine();
        List<String> nonNumbers = new ArrayList<>();
        TreeSet<Integer> integers = new TreeSet<>(Collections.reverseOrder());

        StringTokenizer strTokens = new StringTokenizer(inputStr, " ");
        String str;
        while (strTokens.hasMoreTokens()) {
            str = strTokens.nextToken();

            try {
                Integer intValue = Integer.parseInt(str);
                integers.add(intValue);
            } catch (Exception e) {
                nonNumbers.add(str);
            }
        }

        nonNumbers.stream().forEach(i -> System.out.println(i));
        integers.stream().forEach(i -> System.out.println(i));

    }

}

