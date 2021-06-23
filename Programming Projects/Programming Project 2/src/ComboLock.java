/*
 * ComboLock.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 2
 *
 * Description:
 * Program constructs a lock combination with three random numbers between 0 and 39,
 * and has methods that are used to turn the dial both left and right as well as to
 * try to open the lock and reset the combination
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

public class ComboLock {
    //declare a private int variable for first number
    private int secret1;
    //declare a private int variable for second number
    private int secret2;
    //declare a private int variable for third number
    private int secret3;
    //declare a private int variable for the first dial position
    private int dialPos;
    //declare a private boolean variable for the first position
    private boolean pos1;
    //declare a private boolean variable for the second position
    private boolean pos2;
    //declare a private boolean variable for the third position
    private boolean pos3;
    //declare a private boolean variable to determine if the lock unlocks
    private boolean unlock;

    /**
     * method sets the first number of the lock combination
     * @param theSecret1 the value of the first number of the combination
     */
    public void setSecret1(int theSecret1){
        //set secret1 to theSecret1
        secret1 = theSecret1;
    }//end setSecret1 method

    /**
     * method sets the second number of the lock combination
     * @param theSecret2 the value of the second number of the combination
     */
    public void setSecret2(int theSecret2){
        //set secret2 to theSecret2
        secret2 = theSecret2;
    }//end setSecret2 method

    /**
     * method sets the third number of the lock combination
     * @param theSecret3 the value of the third number of the combination
     */
    public void setSecret3(int theSecret3){
        //set secret3 to theSecret3
        secret3 = theSecret3;
    }//end setSecret3 method

    /**
     * method turns the lock right a certain number of ticks
     * @param ticks the number of ticks to turn the lock right
     */
    public void turnRight(int ticks){
        //if dialPos - ticks is greater than 0, move dial
        if(dialPos - ticks > 0){
            dialPos = dialPos - ticks;
        }
        //if dialPos - ticks is less than 0, set dialPos equal to number of 40 - ticks left after reaching 0
        else{
            dialPos = 40 - (ticks - dialPos);
        }

        //if dialPos is equal to secret1, set pos1 to true
        if(dialPos == secret1){
            pos1 = true;
        }
        //if not, check if dialPos is equal to secret3 - if so, set pos3 to true
        else{
            if(dialPos == secret3){
                pos3 = true;
            }
        }
    }//end turnRight method

    /**
     * method turns the lock left a certain number of ticks
     * @param ticks the number of ticks to turn the lock left
     */
    public void turnLeft(int ticks){
        //if dialPos + ticks is less than 40, move dial
        if(dialPos + ticks < 40) {
            dialPos = dialPos + ticks;
        }
        //if dialPos + ticks is more than 40, set dialPos equal to the number of ticks left after reaching 39
        else{
            dialPos = ticks - (40 - dialPos);
        }

        //if dialPos is equal to secret2, set pos2 to true
        if(dialPos == secret2){
            pos2 = true;
        }
    }//end turnLeft method

    /**
     * method decides whether or not the lock should unlock
     * @return the boolean value of unlock - true if lock should unlock, false if it shouldn't unlock
     */
    public boolean isOpen(){
        //if pos1, pos2, and pos3 are all true, set unlock to true
        if(pos1 && pos2 && pos3){
            unlock = true;
        }
        else{
            unlock = false;
        }

        //return unlock
        return unlock;
    }//end isOpen method

    /**
     * method resets the boolean position values to false and resets dialPos to 0
     */
    public void reset(){
        //reset pos1, pos2, pos3 to false and dialPos to 0
        pos1 = false;
        pos2 = false;
        pos3 = false;
        dialPos = 0;
    }//end reset method

    /*
    public int getSecret1(){
        return secret1;
    }
    public int getSecret2(){
        return secret2;
    }
    public int getSecret3(){
        return secret3;
    }
    Above are accessor methods I used to print values in the tester class so that I could test code
     */

}//end public class ComboLock
