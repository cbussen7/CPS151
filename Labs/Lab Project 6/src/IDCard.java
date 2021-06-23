/*
 * IDCard.java
 * Christopher Bussen, bussenc1
 */

public class IDCard extends Card{
    //declare private String instance variable for ID number - string because it contains hyphens
    private String idNumber;

    public IDCard(String name){
        //empty constructor
    }//end IDCard constructor

    public IDCard(String name, String id){
        super(name);
        idNumber = id;
    }//end IDCard constructor

    public String toString(){
        return super.toString() + ", ID: " + idNumber;
    }//end toString method

}//end public class IDCard
