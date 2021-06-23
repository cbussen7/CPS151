/*
 * SocialNetworking.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 8
 *
 * Description:
 * Program reads a text file and a set of friends for each username as well as adds the source user name and
 * corresponding user object to a map. The program then asks the user to enter a username and prints out the
 * usernames that are one or two links away from the given username
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SocialNetworking {
    public static void main(String[] args){
        //declare a HashMap variable with Strings and Users
        HashMap<String, User> friendMap = new HashMap<>();

        //declare String variable for file name and oath
        String fileName = "/Users/ChristopherBussen/Desktop/School/UD S2021/CPS 151/Programming Projects/Programming Project 8/friends.txt";

        try {
            //declare new Scanner for reading files
            Scanner in = new Scanner(new File(fileName));

            //use while loop to loop through file
            while (in.hasNext()) {
                //declare a String variable for each line
                String friendsPair = in.nextLine();
                //use split method to split each line
                String[] splitPair = friendsPair.split(" ");
                if (splitPair != null) {
                    //declare new User variables for the source username and the friend username
                    User source;
                    User friend = new User(splitPair[1]);
                    //if the source username isn't already in the map, create a new user
                    if (!friendMap.containsKey(splitPair[0])) {
                        source = new User(splitPair[0]);

                    }
                    //otherwise, get the user from the map
                    else {
                        source = friendMap.get(splitPair[0]);
                    }
                    //add friend to source's set of friends
                    source.addFriends(friend.getName());
                    //add the source and friend to the map
                    friendMap.put(splitPair[0], source);
                }
            }
        }
        //catch FileNotFoundException
        catch(FileNotFoundException ex){
            System.out.println("File not found");
            ex.printStackTrace();
        }

        //declare new scanner
        Scanner input = new Scanner(System.in);

        /*
        //code I used to quickly test if program was working
        System.out.println("Enter a username: ");
        String name = input.next();
        if(friendMap.containsKey(name)) {
            HashSet<User> setOfFriends = (friendMap.get(name)).getFriendSet();
            for(User user: setOfFriends)
                System.out.println(user.getName());
        }
        */

        //declare a boolean variable for continuing to ask user to enter name
        boolean enterName = true;

        //while enterName is true, ask user to enter username
        while(enterName){
            //prompt user to enter name
            System.out.println("Enter a username (enter 'quit' to end): ");
            //declare String variable for given username
            String username = input.next();

            //if user enters quit, exit loop
            if(username.equals("quit")){
                enterName = false;
            }
            //otherwise use showFriends method to print friends one or two links away
            else {
                showFriends(username, 0, friendMap);
            }
        }
    }//end main method

    /**
     * recursive method used to output all of the usernames that are one or two links away from the given user
     * @param sourceName name of given user
     * @param level number of links away from user
     * @param groupsOfFriends map of friends for given user names
     */
    public static void showFriends(String sourceName, int level, HashMap<String, User> groupsOfFriends){
        if(level <= 2){
            //if given name is a key in the map, create a set for that user's friends using the getFriendSet method
            if(groupsOfFriends.containsKey(sourceName)) {
                HashSet<User> setOfFriends = (groupsOfFriends.get(sourceName)).getFriendSet();

                //use enhanced for loop and recursion to print usernames that are 1 or 2 links away
                for(User user: setOfFriends) {
                    System.out.println(user.getName());
                    showFriends(user.getName(), level+1, groupsOfFriends);
                }
            }
            //if username isn't in map, print error message
            else{
                System.out.println("Username not found in map");
            }
        }
    }//end showFriends method
}//end public class SocialNetworking
