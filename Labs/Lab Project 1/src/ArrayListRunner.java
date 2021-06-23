/*
 * ArrayListRunner.java
 * Christopher Bussen, bussenc1
 */

/*
 * ArrayListRunner: no inputs ; strings
 *
 * program creates an ArrayList of names and uses ArrayList methods to modify
 * the ArrayList in several ways
 *
 */

import java.util.ArrayList;

public class ArrayListRunner
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);

        //add names: Alice, Bob, Connie, David, Edward, Fran, Gomez, Harry and print the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println("Names: " + names);

        //Call the ArrayList's get() method to retrieve and print the first and last names
        System.out.println("First name: " + names.get(0));
        System.out.println("Last name: " + names.get(7));

        //Print the size() of the ArrayList
        System.out.println("ArrayList size: " + names.size());

        //Use size() to help you print the last name in the list
        System.out.println("Last name: " + names.get(names.size()-1));

        //Use set() to change “Alice” to “Alice B. Toklas”.
        names.set(0, "Alice B. Toklas");
        System.out.println("Names: " + names);

        //Use the alternate form of add() to insert “Doug” after “David”
        names.add(4, "Doug");
        System.out.println("Names: " + names);

        //Use a loop (instead of a single call to System.out.println) to print each name in the ArrayList
        System.out.print("Names: [");
        for(int i = 0; i < names.size(); i++){
            System.out.print(names.get(i));
            if(i < names.size()-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //Create a second Array List called names2 that is built by calling the ArrayList constructor that accepts another ArrayList as an argument
        ArrayList<String> names2 = new ArrayList<>(names);
        System.out.println("Names2: " + names2);

        //Call names.remove(0) to remove the first element from the original ArrayList
        names.remove(0);

        //print names and names2
        System.out.println("Names: " + names);
        System.out.println("Names2: " + names2);
    }
}
