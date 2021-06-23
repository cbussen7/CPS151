/*
 * GameOfPig.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 4
 *
 * Description:
 * program switches off taking turns between user and computer until one player accumulates
 * 100 or more points in the game - user can choose between rolling and holding on each turn, if
 * a 1 is rolled the user gets no points for that turn - computer will keep rolling until it gets
 * a 1 or accumulates 20+ points on the given turn
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

import java.util.Scanner;

public class GameOfPig {
    public static void main(String [] args){
        //print intro to game/directions by calling printDirections method
        printDirections();

        //declare an int variable for the user's score by calling userTurn using 0 as a parameter
        int userScore = userTurn(0);
        //declare an int variable for the computer's score by calling computerTurn using 0 as a parameter
        int computerScore = computerTurn(0);

        //declare a boolean variable for if the game is over
        boolean gameOver = false;

        //while gameOver is false, switch off turns
        while(!gameOver){
            //update userScore by calling the userTurn method using userScore as a parameter
            userScore = userTurn(userScore);
            //if userScore is greater than or equal to 100, set gameOver to false and break out of while loop
            if(userScore >= 100){
                break;
            }

            //update computerScore by calling the computerTurn method using computerScore as a parameter
            computerScore = computerTurn(computerScore);
            //if computerScore is greater than or equal to 100, set gameOver to false
            if(computerScore >= 100){
                gameOver = true;
            }
        }

        //print a statement saying who one the game
        if(userScore >= 100){
            System.out.println("CONGRATULATIONS, YOU WIN!");
        }
        else{
            System.out.println("THE COMPUTER WINS!");
        }

    }//end main method

    /**
     * method prints game directions
     */
    public static void printDirections(){
        System.out.println("Welcome to the game of Pig!");
        System.out.println("Here, you and I take turns rolling a single six -sided die; " +
                "the first player to reach 100 or more points wins.\n");
        System.out.println("On your turn, you roll a six - sided die:");
        System.out.println("If you roll a 1, then you get no new points for that turn and it becomes my turn.");
        System.out.println("If you roll a 2 through 6, then you can either");
        System.out.println("ROLL AGAIN (by entering 'r' at the prompt) or" +
                "\nHOLD(by entering 'h' at the prompt).");
        System.out.println("At this point, the sum of all rolls for that turn is added to the your score and it becomes the my turn.");
        System.out.println("OK, you get to go first; good luck!\n");
    }

    /**
     * method allows user to continue rolling until they hold or roll a 1 and updates their score
     * as the turn goes on
     * @param oldUserScore the user's current score coming into their current turn
     * @return the user's new score after their turn or the user's old score if they roll a one
     */
    public static int userTurn(int oldUserScore){
        //update user score
        int newUserScore = oldUserScore;

        //declare an int variable for the turn score
        int turnScore = 0;

        //import scanner
        Scanner input = new Scanner(System.in);

        //create new Die object
        Die userGameDie = new Die();

        //declare a boolean variable for roll again
        boolean rollAgain = true;

        //as long as user doesn't roll a 1 and rollAgain is true, keep rolling for user
        while(rollAgain){
            //declare an int variable for the dice roll
            int diceRoll = userGameDie.roll();

            //if user rolls a 1, tell them their turn is over and return oldUserScore
            if(diceRoll == 1){
                System.out.println("You rolled: 1");
                System.out.println("You lose your turn! Your total is " + oldUserScore + "\n");
                return oldUserScore;
            }
            else {
                //update turnScore
                turnScore = turnScore + diceRoll;
                //update newUserScore
                newUserScore = newUserScore + diceRoll;

                //show what the user rolled and prompt them to roll again or hold
                System.out.println("You rolled: " + diceRoll);

                //break out of loop if user goes past 100 points in middle of turn
                if(newUserScore >= 100){
                    break;
                }

                System.out.println("Your turn score is " + turnScore + ", your total score is " + oldUserScore);
                System.out.println("If you hold, you will have " + newUserScore + " points. \nEnter 'r' to roll again, 'h' to hold.");

                //declare a String variable for the user input
                String userInput = input.next();
                userInput = userInput.toLowerCase();

                //if userInput equals h, set rollAgain to false
                if (userInput.equals("h")) {
                    rollAgain = false;
                }
                //if user input doesn't equal h but doesn't equal r, end the user's turn
                else if (!(userInput.equals("r"))) {
                    System.out.println("Invalid input - your turn has come to an end\n");
                    rollAgain = false;
                }
            }
        }

        //print the user's new score and return newUserScore
        System.out.println("Your score is " + newUserScore + "\n");
        return newUserScore;
    }//end userTurn method

    /**
     * method rolls for the CPU until it accumulates 20 or more points in a turn or rolls a 1 - updates
     * score as turn goes on
     * @param oldCPUScore the computer's score coming into the turn
     * @return the new computer score or the old computer score if a 1 is rolled
     */
    public static int computerTurn(int oldCPUScore){
        System.out.println("It's the computer's turn");
        //update CPU score
        int newCPUScore = oldCPUScore;
        //declare an int variable for the CPU turn score
        int computerTurnScore = 0;

        //create a new Die object
        Die computerGameDie = new Die();

        //while turnScore is less than 20, keep rolling
        while(computerTurnScore < 20){
            //declare an int variable for the computer's roll and print the roll
            int rollResult = computerGameDie.roll();
            System.out.println("The computer rolled: " + rollResult);

            //if the computer rolls a 1, end the turn and return oldCPUScore
            if(rollResult == 1){
                System.out.println("The computer lost its turn!");
                System.out.println("Computer's score is " + oldCPUScore + "\n");
                return oldCPUScore;
            }
            //otherwise, update computerTurnScore and newCPUScore
            else{
                computerTurnScore = computerTurnScore + rollResult;
            }
        }

        //update newCPUScore by adding computerTurnScore
        newCPUScore = newCPUScore + computerTurnScore;

        //print the new computer score and return newCPUScore
        System.out.println("The computer's score is " + newCPUScore);
        return newCPUScore;
    }//end computerTurn method

}//end public class GameOfPig
