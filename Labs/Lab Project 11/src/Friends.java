/*
 * Friends.java
 * Christopher Bussen, bussenc1
 */

import java.util.*;

public class Friends {
    public static void main(String[] args){
        //import Scanner
        Scanner input = new Scanner(System.in);

        //create a HashMap that stores each student's friends - keys should be Strings, values should be ArrayList
        Map<String, ArrayList<String>> friends = new HashMap<>();

        //declare an ArrayList to store Sue's friends
        ArrayList<String> friendsList = new ArrayList<>();
        friendsList.add("Bob");
        friendsList.add("Jose");
        friendsList.add("Alex");
        friendsList.add("Cathy");
        //add Sue and her friends to the Map
        friends.put("Sue", friendsList);

        //reset the ArrayList
        friendsList = new ArrayList<>();
        friendsList.add("Bob");
        friendsList.add("Alex");
        //add Cathy and her friends to the Map
        friends.put("Cathy", friendsList);

        //reset the ArrayList
        friendsList = new ArrayList<>();
        friendsList.add("Alex");
        friendsList.add("Jose");
        friendsList.add("Jerry");
        //add Bob and her friends to the Map
        friends.put("Bob", friendsList);

        //declare a boolean variable for whether or not to keep asking user
        boolean keepAsking = true;

        //while keepAsking is true, prompt user to enter a new name
        while(keepAsking) {
            //prompt user to enter name
            System.out.print("Enter a name (quit to stop): ");

            //declare a String variable for user input
            String userInput = input.nextLine();

            //if userInput is a key in the Map, print name and list of friends
            if (friends.containsKey(userInput)) {
                System.out.println(userInput + ": " + friends.get(userInput));
            }
            else if(userInput.equals("quit")){
                keepAsking = false;
            }
            //otherwise tell user the name is not in the HashMap
            else {
                System.out.println("Name is not in the HashMap");
            }
        }
    }//end main method
}//end public class Friends
