/*
 * DoorTester.java
 * Christopher Bussen, bussenc1
 */

import java.util.ArrayList;

public class DoorTester {
    public static void main(String[] args){
        //Declare an ArrayList doors with element type type Door
        ArrayList<Door> doors = new ArrayList<>();

        //Add a new Door to the doors ArrayList as a new open Side door
        Door door1 = new Door();
        door1.setName("Side");
        door1.open();
        doors.add(door1);

        //Add a new Door to the doors array as a new closed Front door
        Door door2 = new Door();
        door2.setName("Front");
        door2.close();
        doors.add(door2);

        //Add a new Door to the doors array as a new closed Back door
        Door door3 = new Door();
        door3.setName("Back");
        door3.close();
        doors.add(door3);

        //Display the doors and their states - could either do 3 statements or an enhanced for loop
        for(Door d : doors){
            d.output();
        }

        //Using any kind of loop, switch the states of the doors in the doors ArrayList; i.e., if a Door is open (i.e., call the Door's isOpen() method), then close it, and vice-versa.
        System.out.println("New door states:");
        for(Door d : doors){
            if(d.isOpen()){
                d.close();
            }
            else{
                d.open();
            }

            //Re-display the doors and their states
            d.output();
        }

    }//end main method
}//end public class DoorTester
