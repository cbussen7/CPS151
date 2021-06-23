/*
 * RadixSort.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 7
 *
 * Description:
 * Program creates a 15 element array of random integers from 10 to 99 and
 * uses auxiliary arrays and the radix sorting method to sort the integers
 * in the array from smallest to largest - starts by sorting each element
 * by their last digit, then sorts based on first digit - program will print
 * sorted array at end
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        //declare an int array of length 15
        int[] numArray = new int[15];

        //use a for loop to fill each array index with a random number from 10 to 99
        for (int i = 0; i < 15; i++) {
            numArray[i] = (int) (Math.random() * 90) + 10;
        }

        //use Arrays.toString method to print unsorted numArray
        System.out.println("Unsorted array: " + Arrays.toString(numArray));

        //call sortLastDigit method using numArray as parameter to partially sort array
        numArray = sortLastDigit(numArray);
        //use Arrays.toString method to print numArray
        System.out.println("Partially sorted array: " + Arrays.toString(numArray));

        //call finishSorting method using numArray as parameter to finish sorting array
        numArray = finishSorting(numArray);

        //use Arrays.toString method to print numArray
        System.out.println("Sorted array: " + Arrays.toString(numArray));

    }//end main method

    /**
     * method goes through the first step of radix sorting - sorts each element into auxiliary arrays
     * based on the last digit and then puts them back into an array
     * @param x the original array of 15 random integers from 10 to 99
     * @return the partially sorted array
     */
    public static int[] sortLastDigit(int[] x){
        //declare 10 auxiliary Integer ArrayLists for each digit
        ArrayList<Integer> aux0 = new ArrayList<>();
        ArrayList<Integer> aux1 = new ArrayList<>();
        ArrayList<Integer> aux2 = new ArrayList<>();
        ArrayList<Integer> aux3 = new ArrayList<>();
        ArrayList<Integer> aux4 = new ArrayList<>();
        ArrayList<Integer> aux5 = new ArrayList<>();
        ArrayList<Integer> aux6 = new ArrayList<>();
        ArrayList<Integer> aux7 = new ArrayList<>();
        ArrayList<Integer> aux8 = new ArrayList<>();
        ArrayList<Integer> aux9 = new ArrayList<>();

        //use a for loop to go throw int array and add values to proper auxiliary ArrayList based on last digit
        for(int i = 0; i < x.length; i++) {
            //use switch statement to add value to right ArrayList
            switch (x[i] % 10) {
                case 0:
                    aux0.add(x[i]);
                    break;
                case 1:
                    aux1.add(x[i]);
                    break;
                case 2:
                    aux2.add(x[i]);
                    break;
                case 3:
                    aux3.add(x[i]);
                    break;
                case 4:
                    aux4.add(x[i]);
                    break;
                case 5:
                    aux5.add(x[i]);
                    break;
                case 6:
                    aux6.add(x[i]);
                    break;
                case 7:
                    aux7.add(x[i]);
                    break;
                case 8:
                    aux8.add(x[i]);
                    break;
                default:
                    aux9.add(x[i]);
                    break;
            }
        }

            //declare a new int array of length 15 to store the values of the auxiliary arrays
            int[] partiallySorted = new int[15];

            //declare a new int variable to keep track of the index of partiallySorted
            int arrayIndex = 0;

            //use for loops to go through each auxiliary ArrayList and add elements into new array
            for(int i = 0; i < aux0.size(); i++){
                //set value of partiallySorted equal to auxiliary array value
                partiallySorted[arrayIndex] = aux0.get(i);
                //increment array index
                arrayIndex++;
            }
            for(int i = 0; i < aux1.size(); i++){
                partiallySorted[arrayIndex] = aux1.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux2.size(); i++){
                partiallySorted[arrayIndex] = aux2.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux3.size(); i++){
                partiallySorted[arrayIndex] = aux3.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux4.size(); i++){
                partiallySorted[arrayIndex] = aux4.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux5.size(); i++){
                partiallySorted[arrayIndex] = aux5.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux6.size(); i++){
                partiallySorted[arrayIndex] = aux6.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux7.size(); i++){
                partiallySorted[arrayIndex] = aux7.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux8.size(); i++){
                partiallySorted[arrayIndex] = aux8.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux9.size(); i++){
                partiallySorted[arrayIndex] = aux9.get(i);
                arrayIndex++;
            }

            //return partiallySorted array
            return partiallySorted;
        }

    /**
     * method goes through the second step of radix sorting - sorts each element into auxiliary arrays
     * based on the first digit and then puts them back into an array
     * @param x the partially sorted array of 15 random integers from 10 to 99
     * @return the fully sorted array
     */
    public static int[] finishSorting(int[] x){
            //declare 10 auxiliary Integer ArrayLists for each digit
            ArrayList<Integer> aux0 = new ArrayList<>();
            ArrayList<Integer> aux1 = new ArrayList<>();
            ArrayList<Integer> aux2 = new ArrayList<>();
            ArrayList<Integer> aux3 = new ArrayList<>();
            ArrayList<Integer> aux4 = new ArrayList<>();
            ArrayList<Integer> aux5 = new ArrayList<>();
            ArrayList<Integer> aux6 = new ArrayList<>();
            ArrayList<Integer> aux7 = new ArrayList<>();
            ArrayList<Integer> aux8 = new ArrayList<>();
            ArrayList<Integer> aux9 = new ArrayList<>();

            //use a for loop to go throw int array and add values to proper auxiliary ArrayList based on first digit
            for(int i = 0; i < x.length; i++) {
                //use switch statement to add value to right ArrayList
                switch (x[i] / 10) {
                    //case 0 should never happen as all elements should be >= 10
                    case 0:
                        aux0.add(x[i]);
                        break;
                    case 1:
                        aux1.add(x[i]);
                        break;
                    case 2:
                        aux2.add(x[i]);
                        break;
                    case 3:
                        aux3.add(x[i]);
                        break;
                    case 4:
                        aux4.add(x[i]);
                        break;
                    case 5:
                        aux5.add(x[i]);
                        break;
                    case 6:
                        aux6.add(x[i]);
                        break;
                    case 7:
                        aux7.add(x[i]);
                        break;
                    case 8:
                        aux8.add(x[i]);
                        break;
                    default:
                        aux9.add(x[i]);
                        break;
                }
            }

            //declare a new int array of length 15 to store the values of the auxiliary arrays
            int[] fullySorted = new int[15];

            //declare a new int variable to keep track of the index of fullySorted
            int arrayIndex = 0;

            //use for loops to go through each auxiliary ArrayList and add elements into new array
            for(int i = 0; i < aux0.size(); i++){
                //set value of partiallySorted equal to auxiliary array value
                fullySorted[arrayIndex] = aux0.get(i);
                //increment array index
                arrayIndex++;
            }
            for(int i = 0; i < aux1.size(); i++){
                fullySorted[arrayIndex] = aux1.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux2.size(); i++){
                fullySorted[arrayIndex] = aux2.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux3.size(); i++){
                fullySorted[arrayIndex] = aux3.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux4.size(); i++){
                fullySorted[arrayIndex] = aux4.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux5.size(); i++){
                fullySorted[arrayIndex] = aux5.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux6.size(); i++){
                fullySorted[arrayIndex] = aux6.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux7.size(); i++){
                fullySorted[arrayIndex] = aux7.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux8.size(); i++){
                fullySorted[arrayIndex] = aux8.get(i);
                arrayIndex++;
            }
            for(int i = 0; i < aux9.size(); i++){
                fullySorted[arrayIndex] = aux9.get(i);
                arrayIndex++;
            }

            //return fullySorted array
            return fullySorted;
        }//end finishSorting method
    }//end public class RadixSort
