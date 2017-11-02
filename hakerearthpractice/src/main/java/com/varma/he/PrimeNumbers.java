package com.varma.he;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);

*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int count = 0;

        for (int i = 1; i < N; i++) {

            count = 0;

            for(int j = 1; j <= i ; j++)
            {
                if(i%j == 0) {
                    //System.out.println(i + " "+ j);
                    count++;
                }
            }

//            System.out.println(i + " count "+ count);

            if ( count == 2)
                System.out.print(i+" ");
        }

    }
}
