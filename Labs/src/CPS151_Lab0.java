/*
 * CPS151_Lab0.java
 * Christopher Bussen, bussenc1
 */

import java.util.Arrays;

/**
 * CPS 151; Algorithms & Programming II
 * Fall 2020 semester
 *
 * Lab Project 0: Review of CPS 150 Material
 *
 * @author *** Christopher Bussen ***
 */

/*
CPS151_Lab0: no inputs ; string

program checks whether or not two given arrays contain the same elements in some order
and tells the user if they do or don't
 */


public class CPS151_Lab0
{
    public static void main(String[] args)
    {
        //declare three int array variables
        int[] a = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        int[] b = {11, 1, 4, 9, 16, 9, 7, 4, 9};
        int[] c = {11, 11, 7, 9, 16, 4, 1, 4, 9};

        System.out.print("The arrays a and b ");

        //call the sameElements method in an if statement to check if arrays a and b have the same elements
        if (!sameElements(a, b)) {
            //if sameElements returns false, tell user a and b don't have the same elements
            System.out.print("do not ");
        }

        System.out.println("have the same elements.");

        System.out.print("The arrays a and c ");

        //call the sameElements method in an if statement to check if arrays a and c have the same elements
        if (!sameElements(a, c)) {
            //if sameElements returns false, tell user a and c don't have the same elements
            System.out.print("do not ");
        }

        System.out.println("have the same elements.");
        
    } // end main method

    /**
     * method checks to see if two arrays have the same elements
     * @param x the first integer array
     * @param y the second integer array
     * @return true if arrays have the same elements, false if not
     */
    public static boolean sameElements(int[] x, int[] y){
        //sort both arrays
        Arrays.sort(x);
        Arrays.sort(y);

        //use for loop to go through both arrays and check if the elements are equal
        for(int i = 0; i < x.length; i++){
            //if the element at index i is not the same for both x and y, return false
            if(x[i] != y[i]){
                return false;
            }
        }

        //return true if for loop ends without returning false
        return true;
    }
} // end public class CPS151_Lab0
