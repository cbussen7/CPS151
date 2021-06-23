/*
 * CreatureGame.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 3
 *
 * Description:
 * Program runs the Creature game - adds as many players as user wants and goes through giving each living
 * player a turn until there is only one living player left - on each turn, players have the choice between
 * attacking a given player, passing their turn, or quitting the game
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CreatureGame {
    public static void main(String[] args){
        //create a new Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Fantasy Game!");
        System.out.println("1. Add players to the game \n 2. Play until there are no remaining players \n Good luck!");

        //create an ArrayList of creatures
        ArrayList<Creature> players = new ArrayList<>();

        System.out.println("First, let's add some players: ");

        try {
            //call addPlayers method using players ArrayList as parameter
            addPlayers(players);

            //print players in game by calling printPlayers method using players ArrayList
            printPlayers(players);

            //start the game by going through the players ArrayList and asking each player what they want to do
            for (int i = 0; i < players.size(); i++) {
                //prompt player to make a move
                System.out.print(players.get(i).getName() + ", select one of the following options:\n" +
                        "a/A: Attack an opponent\n" + "p/P: Pass (go to the next player)\n" + "q/Q: Quit the game\n");
                String move = input.next();
                move = move.toLowerCase();
                //if player selects attack, call attack method
                if (move.equals("a")) {
                    //print remaining players and ask user who to attack
                    printPlayers(players);

                    //prompt user to enter player number to attack
                    System.out.print(players.get(i).getName() + ", who would you like to attack (enter player number)? ");

                    //declare an int variable for the player getting attacked
                    int attacked = input.nextInt();

                    //check to make sure player number is valid - if it use, inflict damage
                    if (attacked >= 0 && attacked < players.size()) {
                        //if species is balrog, attack twice
                        if (players.get(i).getSpecies().equals("b")) {
                            //find the damage done by the attacker and declare an int variable for it
                            int damageDone = players.get(i).getDamage();
                            //inflict damage on the attacked player using damageDone variable
                            players.get(attacked).Damage(damageDone);
                            damageDone = players.get(i).getDamage();
                            players.get(attacked).Damage(damageDone);
                        }
                        //otherwise, just attack once
                        else {
                            int damageDone = players.get(i).getDamage();
                            players.get(attacked).Damage(damageDone);
                        }
                    }
                    //otherwise skip player's turn
                    else {
                        System.out.println("Invalid player - your turn has ended");
                    }
                }
                //if player selects quit, remove them from the ArrayList
                else if (move.equals("q")) {
                    System.out.println("Thank you for playing, " + players.get(i).getName());
                    players.remove(i);
                }
                //if user enters anything else, pass their turn
                else {
                    System.out.println(players.get(i).getName() + ", you have passed your turn");
                }

                //call the checkPlayerLives method using the players ArrayList to remove any dead players
                checkPlayerLives(players);

                //if there is one player left, end the game
                if (players.size() == 1) {
                    System.out.println("Congratulations " + players.get(0).getName() + "! You won!");
                    break;
                }

                //if i equals players.size-1, reset i to -1
                if (i == players.size() - 1) {
                    i = -1;
                }
            }
        }
        //catch IllegalArgumentExceptions and any other exceptions
        catch(IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
        catch(Exception ex){
            System.out.println("Invalid input, please rerun program");
            ex.printStackTrace();
        }

    }//end main method

    /**
     * method prints all of the players and their stats
     * @param playerList the ArrayList of Creature players
     */
    public static void printPlayers(ArrayList<Creature> playerList){
        //print out all of the players in the game using a for loop
        for(int i = 0; i < playerList.size(); i++){
            String playerCredentials = "";
            playerCredentials = playerCredentials + playerList.get(i).getName() + " | ";
            playerCredentials = playerCredentials + playerList.get(i).getSpecies() + " | ";
            playerCredentials = playerCredentials + playerList.get(i).getStrength() + " | ";
            playerCredentials = playerCredentials + playerList.get(i).getHitPoints();
            System.out.println("Player " + i + ": " + playerCredentials);
        }
    }//end printPlayers method

    /**
     * method goes through list of players and removes any dead players
     * @param playerList the list of players in the game
     * @return the updated ArrayList of players
     */
    public static ArrayList checkPlayerLives(ArrayList<Creature> playerList){
        //use for loop to go through ArrayList and check status of each player
        for(int i = 0; i < playerList.size(); i++){
            //if any players are dead, remove them from the ArrayList
            if(playerList.get(i).isDead()){
                System.out.println("Sorry " + playerList.get(i).getName() + "! You are dead and out of the game.");
                playerList.remove(i);
            }
        }
        //return updated ArrayList of players
        return playerList;
    }

    /**
     * method adds a certain number of players into the game
     * @param playerList the ArrayList that players will be added into (accepts objects of type Creature)
     * @return the ArrayList with the different players in it
     * @throws IllegalArgumentException if the given species is not valid
     */
    public static ArrayList addPlayers(ArrayList<Creature> playerList) throws IllegalArgumentException {
        //declare Scanner
        Scanner input = new Scanner(System.in);

        //declare a boolean variable for adding players - set to true
        boolean addPlayer = true;

        //while addPlayer is true, keep adding creatures
        while(addPlayer){
            System.out.print("Enter player's name ('quit' when no more players): ");
            String playerName = input.nextLine();
            //if user enters quit, set addPlayer to false
            if(playerName.equals("quit")){
                addPlayer = false;
            }
            //otherwise, add player to players
            else {
                System.out.print(playerName + ", what species are you? \n\t b/B: Balrog\n\t" +
                        "c/C: Cyberdemon\n\t" + "e/E: Elf\n\t" + "h/H: Human\n Select species: ");
                String playerSpecies = input.nextLine();
                playerSpecies = playerSpecies.toLowerCase();
                //create a new creature using the given name and species (use two parameter constructor)
                Creature newPlayer = new Creature(playerName, playerSpecies);
                //add the creature to the list of players using the name and species provided
                playerList.add(newPlayer);
            }
        }

        //return the ArrayList of players
        return playerList;
    }//end addPlayers method

}//end public class CreatureGame
