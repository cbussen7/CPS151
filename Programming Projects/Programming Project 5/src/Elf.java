/*
 * Elf.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 5
 *
 * Description:
 * Object class provides specific methods for the characteristics of a elf creature - is a
 * subclass of Creature
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

public class Elf extends Creature {

    /**
     * method is used as a constructor for the Creature class - takes in name and assigns random
     * value to strength and hitPoints
     * @param newName name of creature to be assigned to name
     */
    public Elf(String newName) throws IllegalArgumentException {
        super(newName);
    }//end Elf constructor method

    public String getSpecies(){
        //return Elf
        return "Elf";
    }//end getSpecies method

    public int getDamage(){
        //set damage equal to damage from superclass
        int damage = super.getDamage();

        //declare an int variable for special attack (random number from 0 to 99) - will be used to determine if a special attack occurs
        int specialAttack = (int) (Math.random() * 100);

        //elves have a 10% chance of special attack - special attack doubles damage
        if(specialAttack < 10){
            damage = damage * 2;
        }

        //return damage
        return damage;
    }//end getDamage method

}//end public class Elf
