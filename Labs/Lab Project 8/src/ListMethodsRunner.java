/*
 * ListMethodsRunner.java
 * Christopher Bussen, bussenc1
 */

import java.util.*;

public class ListMethodsRunner
{
    public static void main(String[] args)
    {
        ArrayList<Integer> tempList = ListMethods.makeList(100);
        if (tempList.size() == 0)
        {
            System.out.println("The list is empty");
        }
        else
        {
            for (Integer i : tempList)
            {
                System.out.println(i);
            }
        }

        //reverse tempList using reverseList method
        tempList = ListMethods.reverseList(tempList);

        //use for loop to print reversed list
        for(Integer i : tempList){
            System.out.println(i);
        }

    } // end main method
} // end class ListMethodsRunner