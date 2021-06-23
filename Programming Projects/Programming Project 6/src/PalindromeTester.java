/*
 * PalindromeTester.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 6
 *
 * Description:
 * Program takes in a word from the user and uses the Word object class to check whether or not
 * the user's word is a palindrome (same forwards as it as backwards) - then prints statement
 * telling user the outcome
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

import java.util.Scanner;

public class PalindromeTester {
    public static void main(String[] args){
        //declare a new Scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a word or phrase and declare a String variable for their input
        System.out.print("Enter a word or phrase: ");
        String inputString = input.nextLine();

        //create a new Word object using the user's input as a parameter in the constructor
        Word wordOrPhrase = new Word(inputString);

        try {
            //use isPalindrome method from Word class to check whether user input is a palindrome - if so tell user
            if (wordOrPhrase.isPalindrome()) {
                System.out.printf("\"%s\" is a palindrome\n", inputString);
            }
            //otherwise, tell user their input is not a palindrome
            else {
                System.out.printf("\"%s\" is not a palindrome\n", inputString);
            }
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }//end main method
}//end public class PalindromeTester
