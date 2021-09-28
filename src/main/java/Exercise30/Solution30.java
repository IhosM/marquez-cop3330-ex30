/*
 *  UCF COP3330 Fall 2021 Assignment 30 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise30;

public class Solution30
{
    public static void main( String[] args ) {
        int size = 12;

        for(int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++)
            {
                System.out.print(String.format("%4d", i * j));
            }

            System.out.println();
        }
    }
}