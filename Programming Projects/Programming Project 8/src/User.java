/*
 * User.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 8
 *
 * Description:
 * Program has variables to store a name as well as a set of each person's group of friends. Program also
 * contains the methods needed to add User objects to the HashSet as well as methods for accessing the name,
 * and updated set of friends
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

import java.util.HashSet;

public class User {
    //declare a private string instance variable for name
    private String name;
    //declare a private HashSet instance variable of User objects for friends
    private HashSet<User> friendSet;

    /**
     * method acts as a one argument constructor for the User class
     * @param name String that name instance variable will be set to
     */
    public User(String name){
        //set name instance variable to passed value
        this.name = name;
        //create empty HashSet for friends
        friendSet = new HashSet<>();
    }//end User constructor method

    /**
     * method acts as an accessor method for name instance variable
     * @return value of name
     */
    public String getName(){
        return name;
    }//end getName method

    /**
     * method adds given User object to friendSet
     * @param friend User object to be added to set
     */
    public void addFriends(String friend){
        //add given User to friendSet
        friendSet.add(new User(friend));
    }//end addFriends method

    /**
     * method acts as an accessor method for friendSet
     * @return the HashSet of friends
     */
    public HashSet<User> getFriendSet(){
        return friendSet;
    }//end getFriendSet method

}//end public class User
