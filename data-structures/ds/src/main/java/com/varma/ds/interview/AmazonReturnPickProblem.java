package com.varma.ds.interview;

/**
 * Return pickup planning
 * <p>
 * Amazon provides a return pickup facility wherein a pickup agent goes to a location, picks up the return packages, and moves to another one.
 * <p>
 * Consider there are
 * . n such continuous locations in a line.
 * . each location has some number of packages.
 * <p>
 * Given the constraint that if a pickup agent picks packages from one location then it cannot pick the packages from
 * adjacent location (the agent moves from left to right, in our line of locations).
 *
 * When there are 5 locations with number of packages in a location as {7, 3,8,11,1}. Now the agent should pick the boxes in such a manner that maximum the number of packages
 * that it/he can pick given the above constraint. If the agent picks 7 boxes from 1st location and 11 boxes 4th location then it maximum the total number of packages
 * that it can pick from return i.e. 18 boxes.
 *
 * TODO - This is not a full solution, please look for your one solutions to solve this problem.
 */


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes

import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class AmazonReturnPickProblem {
    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */

        //Scanner
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();                 // Reading input from STDIN

        int[] intArray = new int[size];

        for (int i = 0; i < size; i++) {
            intArray[i] = s.nextInt();
        }

        int finalMax = 0, currentMax;

        for (int i = 0; i < intArray.length; i++) {
            currentMax = findMax(intArray, 0, i);
            if (currentMax > finalMax) {
                finalMax = currentMax;
            }
        }

        System.out.println(finalMax);

    }

    private static int findMax(int[] a, int sum, int cIndex) {

        if (cIndex == a.length - 1) {
            return sum + a[cIndex];
        }

        int currentMax, actualMax = 0;
        for (int i = 2; cIndex + i < a.length; i++) {

            currentMax = findMax(a, sum + a[cIndex], cIndex + i);
            if (actualMax < currentMax)
                actualMax = currentMax;
        }


        return actualMax;
    }

}

