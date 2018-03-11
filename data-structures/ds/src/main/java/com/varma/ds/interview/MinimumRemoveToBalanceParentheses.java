package com.varma.ds.interview;

/**
 * Created by varma on 3/11/2018.
 */

import java.util.*;

/*TODO : This is a full solution, this need to be further worked to solve all the cases. */
public class MinimumRemoveToBalanceParentheses {

    public static void main(String args[]) throws Exception {

        //String str = "()()))";
        //String str = "((X)()))";
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int min = remove(str.toCharArray());

        HashSet<String> strings = printCombination(str.toCharArray(), min);

        for (String s : strings) {
            System.out.println(s);
        }

    }

    public static int noOfLeftParantheses(char[] arr, int from) {
        int count = 0;

        for (int i = from; i < arr.length; i++) {
            if (arr[i] == ')') count = count + 1;
        }

        return count;
    }

    public static HashSet<String> printCombination(char[] arr, int min) {


        HashSet<String> strings = new HashSet<>();

        int inMin = min;
        String str;
        for (int j = 0; j < arr.length; j++) {
            str = "";
            int x = 0;
            inMin = min;
            int leftCount = noOfLeftParantheses(arr, j + 1);
            if (leftCount <= inMin) {
                break;
            }
            while (x <= j) {
                str += arr[x];
                x++;
            }

            for (int i = j + 1; i < arr.length; i++) {

                if (arr[i] != ')') {
                    str += arr[i];

                } else if (arr[i] == ')') {
                    if (inMin <= 0)
                        str += arr[i];
                    inMin--;
                }
            }

            strings.add(str);
        }

        return strings;

    }

    public static int remove(char input[]) {
        if (input == null) {
            return 0;
        }
        Deque<Integer> dq = new LinkedList<Integer>();
        for (int i = 0; i < input.length; i++) {
            //skip non bracket characters
            if (input[i] != '(' && input[i] != ')') {
                continue;
            }

            //add opening brackets
            if (input[i] == '(') {
                dq.addFirst(i);
            } else if (input[i] == ')') {
                //if top is opening bracket just remove from stack else add closing bracket
                if (!dq.isEmpty() && input[dq.peekFirst()] == '(') {
                    dq.pollFirst();
                } else {
                    dq.addFirst(i);
                }
            }
        }

        return dq.size();
    }
}
