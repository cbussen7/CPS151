/*
 * Human.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 5
 *
 * Description:
 * Object class provides specific methods for the characteristics of a human creature - is a
 * subclass of Creature
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

public class Human extends Creature {
    /**
     * method is used as a constructor for the Human class - takes in name and assigns random
     * value to strength and hitPoints
     * @param newName name of creature to be assigned to name
     */
    public Human(String newName) throws IllegalArgumentException {
        super(newName);
    }//end Human constructor method

    public String getSpecies(){
        //return Human
        return "Human";
    }//end getSpecies method
}//end public class Human
