package com.varma.ds.he;

//import for Scanner and other utility classes

import java.util.Scanner;


class StringPalindrome {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
            {
                System.out.print("NO");
                System.exit(0);
            }
        }

        System.out.println("YES");
    }
}
