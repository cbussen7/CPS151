/*
 * Cyberdemon.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 5
 *
 * Description:
 * Object class provides specific methods for the characteristics of a cyberdemon creature - is a
 * subclass of Demon
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

public class Cyberdemon extends Demon{

    /**
     * method is used as a constructor for the Cyberdemon class - takes in name and assigns random
     * value to strength and hitPoints
     * @param newName name of creature to be assigned to name
     */
    public Cyberdemon(String newName) throws IllegalArgumentException {
        super(newName);
    }//end Cyberdemon constructor method

    public String getSpecies(){
        //return Cyberdemon
        return "Cyberdemon";
    }//end getSpecies method
}//end public class Cyberdemon
