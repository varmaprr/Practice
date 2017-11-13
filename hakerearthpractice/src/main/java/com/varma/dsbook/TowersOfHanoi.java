package com.varma.dsbook;

import java.util.Scanner;

/**
 * Created by varma on 11/13/2017.
 */
public class TowersOfHanoi {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char A = 'a', B = 'b', C =  'c';

        towerOfHanoi(n, A, B ,C);

    }

    public static void towerOfHanoi(int n, char fromPeg, char toPeg, char AuxPeg){

        if(n == 1){
            System.out.println(" Moving disk 1 from "+fromPeg + " to "+ toPeg);
            return;
        }
        else{
            towerOfHanoi(n-1, fromPeg, AuxPeg, toPeg);
            System.out.println("Moving disk from peg "+ fromPeg+" to "+AuxPeg);
            towerOfHanoi(n-1, AuxPeg, toPeg, fromPeg);
        }
    }
}
