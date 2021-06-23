/*
 * VendingMachine.java
 * Christopher Bussen, bussenc1
 */

public class VendingMachine {
    //declare instance variables for number of cans and number of tokens
    private int numCans;
    private int numTokens;

    public VendingMachine(){
        //initialize number of cans to 10 and number of tokens to 0
        numCans = 10;
        numTokens = 0;
    }//end VendingMachine constructor

    public VendingMachine(int cans){
        numCans = cans;
        numTokens = 0;
    }//end VendingMachine constructor

    public void fillUp(int cans){
        //add cans to numCans
        numCans = numCans + cans;
    }//end fillUp method

    public void insertToken(){
        //increase token count by 1
        numTokens++;

        //if numCans is greater than 0, decrease it by 1
        if(numCans > 0){
            numCans--;
        }
    }//end insertToken method

    public int getCanCount(){
        return numCans;
    }//end getCanCount method

    public int getTokenCount(){
        return numTokens;
    }//end getTokenCount method

}//end public class VendingMachine
