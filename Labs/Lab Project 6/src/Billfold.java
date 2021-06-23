/*
 * Billfold.java
 * Christopher Bussen, bussenc1
 */

import java.util.ArrayList;

public class Billfold {
    //declare a private ArrayList instance variable of type Card
    private ArrayList<Card> cards = new ArrayList();

    public void addCard(Card newCard) {
        //add newCard to cards
        cards.add(newCard);
    }//end addCard method

    public String toString() {
        //declare a string variable to hold the new string
        String result = "[ ";
        for (int i = 0; i < cards.size(); i++) {
            if (i < cards.size() - 1) {
                //add card onto result and add separator if not last card
                result = result + cards.get(i).toString() + " | ";
            }
            else {
                //add card to result without separator
                result = result + cards.get(i).toString();
            }
        }
        result = result + " ]";

        //return result
        return result;
    }
}
