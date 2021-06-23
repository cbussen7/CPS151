/*
 * Balrog.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 5
 *
 * Description:
 * Object class provides specific methods for the characteristics of a balrog creature - is a
 * subclass of Demon
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

public class Balrog extends Demon {

    /**
     * method is used as a constructor for the Balrog class - takes in name and assigns random
     * value to strength and hitPoints
     * @param newName name of creature to be assigned to name
     */
    public Balrog(String newName) throws IllegalArgumentException {
        super(newName);
    }//end Balrog constructor method

    public String getSpecies(){
        //return Balrog
        return "Balrog";
    }//end getSpecies method

    public int getDamage(){
        //set damage1 equal to damage from Demon superclass
        int damage1 = super.getDamage();

        //repeat process above since balrogs get to attack twice
        //set damage2 equal to damage from superclass
        int damage2 = super.getDamage();

        //return damage1 + damage2
        return damage1 + damage2;
    }
}//end public class Balrog
