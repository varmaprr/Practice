    package com.varma.ds.he;

    /**
     * Created by varma on 11/3/2017.
     */

    import java.util.Scanner;

    class FindProduct {

        public static void main(String args[]) throws Exception {

            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            int nextInt = 0;
            double answer = 1;

            for (int i = 0; i < N; i++) {
                nextInt = s.nextInt();
                answer = ( answer * nextInt )% (Math.pow(10,9)+7);
            }

            System.out.println((int) answer);
        }
    }

