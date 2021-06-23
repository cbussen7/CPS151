/*
 * Creature.java
 * Christopher Bussen, bussenc1
 */

public class Postcard {
    //declare private instance variables for the postcard's message, the sender, and the recipient
    private String message;
    private Name sender;
    private Name recipient;

    public Postcard(Name theSender, String theMessage){
        //assign theSender value to sender and theMessage value to message (and recipient to null)
        sender = theSender;
        message = theMessage;
        recipient = null;
    }//end Postcard constructor

    public void setRecipient(Name theRecipient){
        recipient = theRecipient;
    }//end setRecipient method

    public void print() {
        System.out.println("Dear " + recipient + ",\n" + message + "\nFrom,\n" + sender);
    }//end printPostcard method

}//end Postcard class
