/*
 * NonEmptyList.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 9
 *
 * Description:
 * program implements the LispList methods for a non-empty list
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

public class NonEmptyList implements LispList{
    //declare private Object instance variables for the head and tail
    private Object head;
    private LispList tail;

    /**
     * method acts as a constructor for the NonEmptyList class
     * @param head value to assign to head variable
     * @param tail value to assign to tail variable
     */
    public NonEmptyList(Object head, LispList tail){
        //set head and tail variables equal to given parameters
        this.head = head;
        this.tail = tail;
    }//end NonEmptyList constructor method

    @Override
    public Object head() {
        return head;
    }//end head method

    @Override
    public LispList tail() {
        return tail;
    }//end tail method

    @Override
    public boolean empty() {
        //return false
        return false;
    }//end empty method

    public LispList cons(Object obj){
        return new NonEmptyList(obj, this);
    }//end cons method

    public String toString(){
        return head() + " "+ tail().toString();
    }//end toString method

    /**
     * method determines the length of the list
     * @return the length of the list
     */
    public int length(){
        //list length starts at 1 as it's a nonempty list
        int length = 1;
        LispList temp = tail();
        while(temp instanceof NonEmptyList){
            temp = temp.tail();
            length++;
        }
        return length;
    }//end length method

    @Override
    public LispList merge(LispList other) {
        return new NonEmptyList(head, other.merge(tail));
    }//end merge method

    /**
     * method checks to see if a given element is in the list
     * @param obj object that user is looking for
     * @return true if element is in the list, false if it is not
     */
    @Override
    public boolean contains(Object obj) {
        //declare a boolean variable for whether or not element is in the list
        boolean inList = false;

        if(head == obj){
            //if found, change inList true
            inList = true;
        }

        LispList temp = tail;
        while(temp instanceof NonEmptyList){
            if(temp.head() == obj){
                //if found, change inList to true
                inList = true;
            }
            temp = temp.tail();
        }

        //return inList
        return inList;
    }//end contains method

    @Override
    public LispList append(LispList other) {
        return new NonEmptyList(this, other);
    }
}//end public class NonEmptyList
