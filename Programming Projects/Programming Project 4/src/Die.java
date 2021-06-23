/*
 * Die.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 4
 *
 * Description:
 * Object class sets the number of sides on the die used for the game and has
 * methods that allow for a random dice roll
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

public class Die {
    //declare a private int variable for the number of sides on the die
    private static int numberOfSides;

    /**
     * method acts as the no-argument constructor for the Die class
     * sets numberOfSides equal to 6
     */
    public Die(){
        numberOfSides = 6;
    }//end Die constructor method

    /**
     * method acts as a constructor for Die class that accepts a parameter
     * @param numberOfSides the number of sides on the die
     */
    public Die(int numberOfSides){
        //set numberOfSides equal to the int passed in the parameter
        this.numberOfSides = numberOfSides;
    }//end Die constructor method


    public static int roll(){
        //declare an int variable for the result of the roll - should be between 1 and the number of sides
        int rollResult = (int) (Math.random()*numberOfSides + 1);
        //return rollResult
        return rollResult;
    }//end roll method

}//end public class Die
