package com.varma.ds.string;

/**
 * Created by varma on 2/15/2018.
 */
public class StringPermutations {

    public static void main(String[] args) {

        String str = new String("ABC");
        int n = str.length();
        permutation(str, 0, n - 1);
    }

    public static void permutation(String str, int l, int r) {
        if (l == r)
            System.out.println(str);

        for (int i = l; i <= r; i++) {
            str = swap(str, l, i);
            permutation(str, l + 1, r);
            str = swap(str, i, l);
        }

    }

    public static String swap(String str, int i, int j) {

        char[] charArr = str.toCharArray();
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;

        return String.valueOf(charArr);

    }
}
