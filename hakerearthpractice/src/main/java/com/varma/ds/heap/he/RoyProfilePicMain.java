package com.varma.ds.heap.he;

/* IMPORTANT: Multiple classes and nested static classes are supported */
//imports for BufferedReader

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes


class RoyProfilePicMain {
    public static void main(String args[]) throws Exception {

        int N = 0;

        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int min_length = Integer.parseInt(s.readLine());

        /*if (min_length <= 1 && min_length >= 10000) {
            System.out.println("Invalid Length, Length should be 1 <= length <= 10000!!");
            System.exit(0);
        }
*/
        int noOfPhotos = Integer.parseInt(s.readLine());

  /*      if (min_length <= 1 && min_length >= 1000) {
            System.out.println("Invalid Length, Length should be 1 <= length <= 1000!!");
            System.exit(0);
        }
*/
        int[][] dims = new int[noOfPhotos][2];

        for (int i = 0; i < noOfPhotos; i++) {
            String str = s.readLine();
            String[] st = str.split(" ");

            dims[i][0] = Integer.parseInt(st[0]);

  /*          if (min_length <= 1 && min_length >= 10000) {
                System.out.println("Invalid width, width should be 1 <= length <= 10000!!");
                System.exit(0);
            }
  */          dims[i][1] = Integer.parseInt(st[1]);

            /*if (min_length <= 1 && min_length >= 10000) {
                System.out.println("Invalid height, Height should be 1 <= length <= 10000!!");
                System.exit(0);
            }*/

        }

        for (int[] d : dims) {
            //System.out.println(d[0]+" "+d[1]);
            if ( min_length > d[0] || min_length > d[1] )
            {
                System.out.println("UPLOAD ANOTHER");
            }else if( min_length <= d[0] && min_length <= d[1] ){

                if(d[0] == d[1]){
                    System.out.println("ACCEPTED");
                }else{
                    System.out.println("CROP IT");
                }
            }
        }

        System.exit(0);
    }
}
