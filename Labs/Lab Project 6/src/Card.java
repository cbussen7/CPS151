/*
 * Card.java
 * Christopher Bussen, bussenc1
 */

 /*
 * Name: Christopher Bussen
 *
 * CPS 151
 * Algorithms & Programming II
 *
 * Lab Project: What's in the Cards? (Java Inheritance)
 *
 * Card.java source code file
 *
 */

public class Card
{
    private String name;

    public Card() {
        name = "";
    }

    public Card(String n) {
        name = n;
    }

    public String toString() {
        return "Card holder: " + name;
    }

} // end public class Card