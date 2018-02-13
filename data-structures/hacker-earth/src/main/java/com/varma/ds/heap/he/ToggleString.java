package com.varma.ds.heap.he;

/**
 * Created by varma on 11/3/2017.
 */
//import for Scanner and other utility classes

import java.util.Scanner;


class ToggleString {
    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char c,sr;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            int ascii = (int) c;
            if(ascii >= 65 && ascii <= 90){
                sr = (char)(ascii+26+6);
            }else{
                sr = (char) (ascii-26-6);
            }
            System.out.print(sr);
        }

    }
}
