package com.varma.ds;

/**
 * Created by varma on 3/31/2018.
 */
public class problems {

    public static void main(String[] args) {

        int first = 0, second = 1, findNthNumber = 100, count = 2, temp;

        while (true) {
            count++;
            temp = first + second;
            first = second;
            second = temp;
            if (count == findNthNumber) {
                System.out.println(temp);
                break;
            }
        }

    }
}
