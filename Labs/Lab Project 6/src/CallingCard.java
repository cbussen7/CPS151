/*
 * CallingCard.java
 * Christopher Bussen, bussenc1
 */

public class CallingCard extends Card{
    //declare private String instance variable for card number
    private String cardNumber;
    //declare private int variable for pin
    private int pin;

    public CallingCard(){
        //empty constructor
    }//end CallingCard constructor

    public CallingCard(String name, String theCardNumber, int thePIN){
        super(name);
        cardNumber = theCardNumber;
        pin = thePIN;
    }//end CallingCard constructor

    public String toString(){
        return super.toString() + ", Card Number: " + cardNumber + ", Pin: " + pin;
    }//end toString method

}//end public class CallingCard
