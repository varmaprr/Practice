package com.varma.he;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes

import java.util.Scanner;


class SeatingArrangement {
    public static void main(String args[]) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int noOfTests = s.nextInt();

        for (int i = 0; i < noOfTests; i++) {
            int n = s.nextInt();

            int perSection = 12;

            int dividend = n % perSection;
            int quotient = n / perSection;

            int v = perSection - dividend;
            int oppositeBerth;
            String berthType;
            String[] typeOfBerths = {"WS", "WS", "MS", "AS", "AS", "MS", "WS", "WS", "MS", "AS", "AS", "MS", "WS"};

            if (dividend == 0) {
                oppositeBerth = quotient * perSection - v + 1;
            } else {
                oppositeBerth = quotient * perSection + v + 1;
            }

            berthType = typeOfBerths[dividend];

            System.out.println(oppositeBerth +  " " + berthType);
        }

    }
}

