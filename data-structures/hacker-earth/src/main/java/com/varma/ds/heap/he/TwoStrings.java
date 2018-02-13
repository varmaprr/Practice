package com.varma.ds.heap.he;

import java.util.Scanner;

/**
 * Created by varma on 11/3/2017.
 */
public class TwoStrings {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        boolean found = true;

        for (int j = 0; j < n; j++) {
            String strings = s.nextLine();
            String[] strs = strings.split(" ");

            for (int i = 0; i < strs[0].length(); i++) {
                if (strs[1].indexOf(strs[0].charAt(i)) == -1) {
                    System.out.println("NO");
                    found = false;
                }
            }

            if(found)
                System.out.println("YES");
        }
    }
}
