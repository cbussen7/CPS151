/*
 * Creature.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 5
 *
 * Description:
 * Object class provides methods for setting a creature's strength, hitPoints, name, and species as well as
 * methods for calculating how much damage a creature will do and updating the creature's strength after
 * being attacked
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

public class Creature {
    //declare private int variables for strength and hit points
    private int strength;
    private int hitPoints;
    //declare private String variables for the creature's name and species
    private String name;
    //declare private final int variables for max strength (150) and min strength (80)
    private final int MAX_STRENGTH = 150;
    private final int MIN_STRENGTH = 80;
    //declare private final int variables for max and min hitPoints (25 and 10)
    private final int MAX_HITPOINTS = 25;
    private final int MIN_HITPOINTS = 10;

    /**
     * method is used as a constructor for the Creature class - takes in name and assigns random
     * value to strength and hitPoints
     * @param newName name of creature to be assigned to name
     * NOTE: I changed the parameters of the constructor class so that it only takes in a name
     * (rather than name, strength, and hit points), then randomly assign strength and hit points
     * to a number in a given range
     */
    public Creature(String newName) throws IllegalArgumentException {
        //assign the parameter values to their respective instance variables
        name = newName;
        //assign strength and hit points to random values within their respective range of values
        strength = (int) (Math.random() * (MAX_STRENGTH-MIN_STRENGTH) + MIN_STRENGTH);
        hitPoints = (int) (Math.random() * (MAX_HITPOINTS-MIN_HITPOINTS) + MIN_HITPOINTS);
    }//end Creature constructor method

    public String getSpecies(){
        //return Creature
        return "Creature";
    }//end getSpecies method

    /**
     * method acts as a mutator for the strength variable
     * @param newStrength the value to be assigned to strength
     * @throws IllegalArgumentException if strength is negative
     */
    public void setStrength(int newStrength) throws IllegalArgumentException {
        //set strength equal to newStrength
        strength = newStrength;

        //if strength is negative, throw an IllegalArgumentException
        if(strength < 0){
            IllegalArgumentException exception = new IllegalArgumentException("Strength must be positive");
            throw exception;
        }
    }//end setStrength method

    public int getStrength(){
        return strength;
    }//end getStrength method

    /**
     * method acts as a mutator for the hitPoints variable
     * @param newHit the value to be assigned to hitPoints
     * @throws IllegalArgumentException if hitPoints is negative
     */
    public void setHitPoints(int newHit) throws IllegalArgumentException {
        //set hitPoints equal to newHit
        hitPoints = newHit;

        //if hitPoints is negative, throw an IllegalArgumentException
        if(hitPoints < 0){
            IllegalArgumentException exception = new IllegalArgumentException("Hit points must be positive");
            throw exception;
        }
    }//end setHitPoints method

    public int getHitPoints(){
        return hitPoints;
    }//end getStrength method

    /**
     * method creates a variable for the amount of damage a creature can do
     * @return the damage a creature will do with an attack
     */
    public int getDamage(){
        //declare an int variable for damage - should be a random number between 0 and hit points
        int damage = (int) (Math.random() * hitPoints + 1);

        //return damage
        return damage;
    }//end getDamage method

    public void Damage(int damage) throws IllegalArgumentException {
        //subtract damage from strength
        strength = strength - damage;

        if(damage < 0){
            IllegalArgumentException ex = new IllegalArgumentException("Damage must be positive");
            throw ex;
        }
    }//end Damage method

    public boolean isDead(){
        //if strength is less than or equal to 0, return true - otherwise return false
        if(strength <= 0){
            return true;
        }
        return false;
    }//end isDead method

    public String getName(){
        return name;
    }//end getName method

    public boolean isNamed(String aName){
        //if aName equals name, return true - otherwise return false
        if(aName.equals(name)){
            return true;
        }
        return false;
    }//end isNamed method

}//end Creature class
