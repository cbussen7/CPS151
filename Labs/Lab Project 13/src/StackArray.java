/*
 * StackArray.java
 * Christopher Bussen, bussenc1
 */

/*
 * CPS 151, Fall 2018 semester
 *
 * Section: 02
 *
 * Lab Project 15: Implementing Stack Operations Using an Array
 *
 * author *** Christopher Bussen ***
 */

import java.util.Arrays;
import java.util.NoSuchElementException;

public class StackArray
{
    private Object[] item;                      // The array where elements are stored
    private int open = 0;                       // The index of the first empty location in the stack
    private static final int INITIAL_SIZE = 2;  // The initial number of item locations in the stack

    /**
     Constructs an empty stack.
     */
    public StackArray()
    {
        item = new Object[INITIAL_SIZE];
    }

    public void push(Object element)
    {
        // put your code here
        item[open]=element;
        open++;

        //if array is full, copy current array into new array of double the size using Arrays.copyOf method
        if(item[item.length-1] != null){
            item = Arrays.copyOf(item, item.length*2);
        }
    }

    public Object pop() throws NoSuchElementException
    {
        // put your code here
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        open--;
        Object result = item[open];
        item[open] = null;

        return result;
    }

    public boolean isEmpty()
    {
        return open == 0;
    }

    public String toString()
    {
        if (open == 0) { return "[]"; }
        String temp = "[" + item[0];
        int i = 1;
        while (i < open)
        {
            temp = temp + ", " + item[i];
            i = i + 1;
        }
        temp = temp + "]";
        return temp;
    } // end toString
} // end class StackArray