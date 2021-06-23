/*
 * EmptyList.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 9
 *
 * Description:
 * program implements the LispList methods for an empty list
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

public class EmptyList implements LispList{
    @Override
    public Object head() throws UnsupportedOperationException{
        //throw UnsupportedErrorException
        UnsupportedOperationException ex = new UnsupportedOperationException();
        return null;
    }//end head method

    @Override
    public LispList tail() throws UnsupportedOperationException{
        //throw UnsupportedErrorException
        UnsupportedOperationException ex = new UnsupportedOperationException();
        return null;
    }//end tail method

    @Override
    public boolean empty() {
        return true;
    }//end empty method

    @Override
    public LispList cons(Object obj) {
        return new NonEmptyList(obj, this);
    }//end cons method

    public String toString(){
        //return empty string
        return "";
    }//end toString method

    public int length(){
        //return 0
        return 0;
    }//end length method

    @Override
    public LispList merge(LispList other) {
        return other;
    }//end merge method

    @Override
    public boolean contains(Object obj) {
        //return false
        return false;
    }//end contains method

    @Override
    public LispList append(LispList other) {
        //return other as list is empty
        return other;
    }
}//end public class EmptyList
