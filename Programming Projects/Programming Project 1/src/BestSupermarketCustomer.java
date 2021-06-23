/*
 * BestSupermarketCustomer.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 1
 *
 * Description:
 * Program takes in each customer's purchase amount in an ArrayList as well the customer's
 * name in a corresponding ArrayList then uses a method to determine and print out the name
 * of the customer with the largest sale
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

/*
 * BestSupermarketCustomer: numbers and names ; name
 *
 * Adds each customer and their purchase amount to ArrayLists then determines and prints
 * the #1 customer in terms of sale price
 *
 * ex1: user inputs 100, John, 200, Jake, 50, Bob, 0 program outputs Jake
 * ex2: user inputs 12.87, John, 56.44, Steve, 1089.01, Jimmy, 88.2, Christopher, 0 program outputs Jimmy
 * ex3: user inputs john program outputs Invalid input
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BestSupermarketCustomer {
    public static void main(String[] args){
        //import Scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the price of the sale and the customer name
        System.out.print("Enter the sale price then the customer name separated by a space (type 0 to be done): ");

        //create an ArrayList for the sale price and another ArrayList for the customer name
        ArrayList<Double> salePrice = new ArrayList<>();
        ArrayList<String> customerNames = new ArrayList<>();

        //declare a boolean variable for the sentinel - 0 - and set to false
        boolean sentinel = false;

        try {
            //use while loop to add elements into each ArrayList
            while (!sentinel) {
                //if price is 0, set sentinel to true
                double price = input.nextDouble();
                if (price == 0) {
                    sentinel = true;
                } else {
                    //add to salePrice and add to customerName
                    salePrice.add(price);
                    customerNames.add(input.nextLine());
                }
            }
        }
        //catch any errors from invalid scanner input
        catch(Exception ex){
            System.out.println("Invalid input");
            ex.printStackTrace();
        }

        //call the nameOfBestCustomer method using the ArrayLists above in a print statement to display the name of the best customer
        System.out.println("Customer of the day: " + nameOfBestCustomer(salePrice, customerNames));

    }//end main method

    /**
     * method checks both ArrayLists and finds the biggest sale and determines the name of the customer corresponding
     * to the biggest sale
     * @param sales the ArrayList containing the price of each sale
     * @param customers the ArrayList containing the name of the customer from each sale
     * @return the name of the customer with the largest sale
     */
    public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers){
        //declare a double variable for the max sale value and an int variable for the position of the max sale
        double maxSale = sales.get(0);
        int posMaxSale = 0;

        //use a for loop to go through sales and find the index of the largest sale
        for(int i = 1; i < sales.size(); i++){
            //if current sale is larger than max, update maxSale and posMaxSale
            if(sales.get(i) > maxSale){
                maxSale = sales.get(i);
                posMaxSale = i;
            }
        }

        //declare a string variable for the name of the best customer - should have the same index in customer as posMaxSale
        String bestCustomer = customers.get(posMaxSale);

        //return bestCustomer
        return bestCustomer;
    }//end nameOfBestCustomer method

}//end public class BestSupermarketCustomer
