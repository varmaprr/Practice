package com.varma.ds.heap.he;

/**
 * Created by varma on 11/2/2017.
 */

import java.io.BufferedReader;
        import java.io.InputStreamReader;

class Anagram
{
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int test=0;test<T;test++)
        {
            int[] M=new int[26];
            char [] A=br.readLine().toCharArray();
            char [] B=br.readLine().toCharArray();

            for(char c:A)
            {
                System.out.println("value c in A"+ c + " " + ((int) c-97));
                M[((int)c)-97]++;
                System.out.println(M);
            }
            for(char c:B)
            {
                System.out.println("value c in b"+c + " " + ((int) c-97));
                M[((int)c)-97]--;
                System.out.print(M);
            }
            int ans=0;
            for(int i=0;i<26;i++)
            {
                System.out.println( M[i] + " " + Math.abs(M[i]) );
                ans+=Math.abs(M[i]);
            }

            System.out.println(ans);


        }
    }
}
