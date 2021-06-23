/*
 * Word.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 6
 *
 * Description:
 * Object class provides methods for checking whether or not a word is a palindrome
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

public class Word {
    //declare a private string variable for the word that will be checked
    private String userWord;

    /**
     * method acts as a constructor for the Word object class - assigns value to userWord instance variable
     * @param theWord word to be assigned to instance variable
     */
    public Word(String theWord){
        userWord = theWord;
    }//end Word constructor method

    /**
     * method is used to check whether or not userWord is a palindrome, i.e., the same forwards and backwards -
     * uses a call to the recursive method reverseString
     * @return true if userWord is a palindrome, false if it is not a palindrome
     */
    public boolean isPalindrome(){
        //if userWord is the same as what reverseString returns, return true - call reverseString with userWord
        if(userWord.equals(reverseString(userWord))){
            return true;
        }
        //otherwise return false
        else{
            return false;
        }
    } //end isPalindrome method

    /**
     * method is used to reverse a given String
     * @param x the string that is meant to be reversed
     * @return the reversed string
     * @throws IllegalArgumentException if the string given in the parameter is null
     */
    public String reverseString(String x) throws IllegalArgumentException{
        //if String is null, throw an illegal argument exception
        if(x.equals(null)){
            IllegalArgumentException ex = new IllegalArgumentException("String can't be null");
            throw ex;
        }

        //use recursion to reverse userWord and assign to reverseWord
        //terminating case - length of string is 1 or less
        if(x.length() <= 1){
            return x;
        }
        //otherwise, make recursive call using everything but first char and add to end
        else{
            return reverseString(x.substring(1)) + x.charAt(0);
        }
    }
} //end reverseString method
