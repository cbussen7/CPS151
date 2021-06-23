/*
 * RunsInDieToss.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 0
 *
 * Description:
 * Program generates a sequence of 20 random die tosses in an array, prints the die values,
 * and marks the runs (adjacent repeated values) by including them in parentheses
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

/*
 * RunsInDieToss: no inputs ; array in form of string
 *
 * Generates 20 random die tosses in an array, prints the die values,
 * and marks the runs (adjacent repeated values) by including them in parentheses
 *
 * ex1: program outputs (3 3) 4 1 4 3 6 2 6 4 2 4 3 1 5 3 6 4 6 2
 * ex2: program outputs 4 5 6 2 5 (1 1) 2 5 2 3 1 (3 3) 6 1 5 (2 2) 3
 * ex3: program outputs 5 1 (5 5) 4 2 5 6 5 1 6 2 5 (1 1) (2 2) 6 1 4
 */

public class RunsInDieToss {
    public static void main(String[] args){
        //declare an int array by calling the generateDieTosses method using 20 as a parameter
        int[] tosses = generateDieTosses(20);

        //call the printRun method
        printRun(tosses);
    } //end main method

    /**
     * Prints values in array by marking runs in parentheses - in other words, prints out array values
     * and puts adjacent repeated values in parentheses - ex: 1 2 (5 5) (4 4) 3 6 etc.
     * @param values the input array to print
     */
    public static void printRun(int[] values) {
        //declare a boolean variable for whether
        boolean inRun = false;

        //declare an int variable for the previous value and set it equal to the first element in the array
        int previousValue = values[0];

        //use a for loop to check for adjacent repeated values
        for (int i = 0; i < values.length - 1; i++) {
            //if inRun is true and the current and previous values are not the same, close the parentheses and set inRun to false
            if (inRun) {
                if (values[i] != previousValue) {
                    System.out.print(")");
                    inRun = false;
                }
            }

            //print a space after the parentheses
            System.out.print(" ");

            //if inRun is false and the current and next values are the same, open the parentheses and set inRun to true
            if(!inRun) {
                if (values[i] == values[i + 1]) {
                    System.out.print("(");
                    inRun = true;
                }
            }

            //set previousValue equal to the current value
            previousValue = values[i];

            //print the current value
            System.out.print(values[i]);
        }

        //use if statements to close runs at the end of the array and/or print the last element
        if (inRun && values[values.length - 1] == previousValue) {
            System.out.print(" " + values[values.length - 1] + ")");
        } else if (inRun && values[values.length - 1] != previousValue) {
            System.out.print(") " + values[values.length - 1]);
        } else {
            System.out.print(" " + values[values.length - 1]);
        }
    } // end printRun method

    /**
     * method creates an array of random die tosses
     * @param tosses the number of random die tosses
     * @return an array of values for the random die tosses
     */
    public static int[] generateDieTosses(int tosses){
        //declare an int array variable of length x to store the values of each die toss
        int[] tossValues = new int[tosses];

        //use a for loop to generate x number of random die tosses and add the values to the array
        for(int i = 0; i < tosses; i++){
            //declare an int variable for the value of the random die toss - should be between 1 and 6
            int dieValue = (int)(Math.random() * 6) + 1;

            //add value for each random toss to array
            tossValues[i] = dieValue;
        }

        //return the array of values
        return tossValues;
    } //end generateDieTosses method
}//end public class RunsInDieToss
