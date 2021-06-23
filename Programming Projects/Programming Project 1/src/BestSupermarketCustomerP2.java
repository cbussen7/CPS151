/*
 * BestSupermarketCustomerP2.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 1
 *
 * Description:
 * Program takes in each customer's purchase amount in an ArrayList, the customer's
 * name in a corresponding ArrayList, and the number of people on the display then
 * uses a method to determine and print out the names of the top customers
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

/*
 * BestSupermarketCustomerP2: numbers, names, number ; names
 *
 * Adds each customer and their purchase amount to ArrayLists then determines and prints
 * the top few customers (number determined by user input)
 *
 * ex1: user inputs 100, John, 200, Jake, 50, Bob, 0, 2 program outputs Jake, John
 * ex2: user inputs 12.87, John, 56.44, Steve, 1089.01, Jimmy, 88.2, Christopher, 0, 3 program outputs Jimmy, Christopher, Steve
 * ex3: user inputs 98.2, Connor, 54, Daniel, 0, 3 program outputs Connor, Daniel
 * ex4: user inputs john program outputs Invalid input
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BestSupermarketCustomerP2 {
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

            //prompt cashier to enter the number of people on the display and declare an int variable for this value
            System.out.print("How many people on the display? ");
            int numPeople = input.nextInt();

            //call the nameOfBestCustomer method using the ArrayLists above in a print statement to display the name of the best customer
            System.out.println("Customers of the day: " + nameOfBestCustomer(salePrice, customerNames, numPeople));
        }
        //catch any errors from invalid scanner input
        catch(Exception ex){
            System.out.println("Invalid input");
            ex.printStackTrace();
        }

    }//end main method

    /**
     * method goes through both ArrayLists several times and finds the topN customers based on largest sale prices
     * @param sales the ArrayList containing the price of each sale
     * @param customers the ArrayList containing the name of the customer from each sale
     * @param topN the number of people included on the top customer display
     * @return an ArrayList with the names of the top customers
     */
    public static ArrayList<String> nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers, int topN){
        //declare an ArrayList to hold the names of the topN customers
        ArrayList<String> names = new ArrayList<>();

        //check if topN is less than the number of customers - if so, set topN to the number of customers
        if(topN > sales.size()){
            topN = sales.size();
        }

        //use a for loop to determine
        for(int j = 0; j < topN; j++) {
            //declare a double variable for the max sale value and an int variable for the position of the max sale
            double maxSale = sales.get(0);
            int posMaxSale = 0;

            //use a for loop to go through sales and find the index of the largest sale
            for (int i = 1; i < sales.size(); i++) {
                //if current sale is larger than max, update maxSale and posMaxSale
                if (sales.get(i) > maxSale) {
                    maxSale = sales.get(i);
                    posMaxSale = i;
                }
            }

            //declare a string variable for the name of the best customer - should have the same index in customer as posMaxSale
            String bestCustomer = customers.get(posMaxSale);
            names.add(bestCustomer);

            //remove maxSale and best customer
            sales.remove(posMaxSale);
            customers.remove(posMaxSale);
        }

        //return names
        return names;
    }//end nameOfBestCustomer method

}//end public class BestSupermarketCustomerP2