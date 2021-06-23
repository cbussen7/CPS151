/*
 * LockTester.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 2
 *
 * Description:
 * Program uses the ComboLock class and prompts the user to turn the dial a certain amount
 * in order to guess the lock combo - if user gets all three numbers correct, lock will open -
 * otherwise lock will remain locked
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

/*
 * LockTester: numbers ; strings
 *
 * Prompts user to try to get the correct three numbers to open the lock - if user
 * doesn't turn the dial the proper amount, lock will remain locked - first turn is to the right
 * (numbers will decrease), then to the left (numbers will increase), then finally to the right
 * again
 *
 * ex1: combo is 10-2-8: user inputs 30, 32, 34 - program outputs Click! Lock is opened
 * ex2: combo is 10-2-8: user inputs 29, 32, 33, n - program outputs Oops! Lock refuses to open
 * ex3: combo is 10-2-8: user inputs 1.2, 33, 33 - program outputs Invalid input
 */

import java.util.Scanner;

public class LockTester {
    public static void main(String[] args){
        //declare a new lock using the ComboLock class
        ComboLock lock1 = new ComboLock();

        //set the three combination numbers to random numbers from 0 to 39
        lock1.setSecret1((int)(Math.random()*39 +1));
        lock1.setSecret2((int)(Math.random()*39 +1));
        lock1.setSecret3((int)(Math.random()*39 +1));

        /*
        System.out.println(lock1.getSecret1());
        System.out.println(lock1.getSecret2());
        System.out.println(lock1.getSecret3());
        Print statements that work with commented accessor methods in object class - used to test code
         */

        /*
        lock1.setSecret1(10);
        lock1.setSecret2(2);
        lock1.setSecret3(8);
        More examples that were used to test code
         */


        //declare a new Scanner
        Scanner input = new Scanner(System.in);

        //declare a boolean variable for whether or not the user wants to keep guessing
        boolean tryAgain = true;

        //use try-catch to prevent any errors
        try {
            //while tryAgain is true, prompt the user to guess the lock combination
            while (tryAgain) {
                //prompt user to enter first number of ticks and call turnRight method
                System.out.print("Enter the 1st # of ticks (to the right): ");
                lock1.turnRight(input.nextInt());

                //prompt user to enter second number of ticks and call turnLeft method
                System.out.print("Enter the 2nd # of ticks (to the left): ");
                lock1.turnLeft(input.nextInt());

                //prompt user to enter third number of ticks and call turnRight method
                System.out.print("Enter the 3rd # of ticks (to the right): ");
                lock1.turnRight(input.nextInt());

                //if isOpen returns true, tell user lock is opened and set tryAgain to false
                if (lock1.isOpen()) {
                    System.out.println("Click! Lock is opened.");
                    tryAgain = false;
                }
                //otherwise, tell user lock is still locked and ask if they want to try again
                else {
                    System.out.println("Oops! Lock refuses to open.");
                    System.out.print("Try again (enter y to try again)? ");

                    //if user enters anything other than y, set tryAgain to false
                    if (!input.next().equals("y")) {
                        tryAgain = false;
                    }

                    //reset the dial
                    lock1.reset();
                }

            }
        }
        //catch any errors from try block
        catch(Exception ex){
            System.out.println("Invalid input");
            ex.printStackTrace();
        }

    }//end main method
}//end public class ComboLockTester
