/*
 * ListMethods.java
 * Christopher Bussen, bussenc1
 */

import java.util.*;
public class ListMethods {
    public static ArrayList<Integer> makeList(int n) {
        ArrayList<Integer> tempList = null;
        if (n <= 0) { // The smallest list we can make ...
            // ... is an empty (new) list
            tempList = new ArrayList<>();
        }
        else{        // All other sized (non-empty) lists are created here
            // a list [1, 2, ... n] is n added to the end of the list [1, 2, ..., n-1]
            tempList = makeList(n-1);
            tempList.add(n);
        }
        return tempList;
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> tList){
        ArrayList<Integer> list = deepClone(tList);
        if (list.size() <= 1) { // The list is empty or has one element
            // Return the list as is – no need to reverse!
            return list;
        }
        else {
            // Use the solution to a smaller version of the problem
            // to solve the general problem
            Integer tempInt = list.get(0);
            list.remove(0);
            list = reverseList(list);
            list.add(tempInt);
        }
        return list;
    }

    private static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i : tList)
        {
            list.add( new Integer(i));
        }
        return list;
    }
} // end class ListMethods
