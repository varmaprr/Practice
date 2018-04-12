package com.varma.ds.array;

/**
 * Created by varma on 4/11/2018.
 * 1. How to identify a cycle in an array. Traversal rule : if a number at arr[i] is positive then move arr[ i ]%n steps forward. If  it's negative then move arr[ i ]%n steps backward
 */
public class CycleInArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 6, 8, 1, -1};

        checkCycleInArray(a);
    }

    private static boolean checkCycleInArray(int[] a) {

        int size = a.length;
        boolean direction; // true is forward false is backward
        int steps, prev, i = 0;
        int[] visited = new int[a.length]; //this stories the index of the previous number.

        while (i < size) {
            direction = a[i] >= 0 ? true : false;
            steps = a[i] % size;
            prev = i;
            i = direction ? i + steps : i - steps;
            if (visited[i] == prev) {
                return true;
            }
            visited[i] = prev;
        }

        return false;
    }
}
