/*
 * DriverLicense.java
 * Christopher Bussen, bussenc1
 */

public class DriverLicense extends IDCard{
    //declare a private int instance variable for expiration year
    private int expirationYear;

    public DriverLicense(String name, String idNumber, int theExpirationYear){
        super(name, idNumber);
        expirationYear = theExpirationYear;
    }//end DriverLicense constructor

    public String toString(){
        return super.toString() + ", Expiration Year: " + expirationYear;
    }//end toString method

}//end public class DriverLicense
