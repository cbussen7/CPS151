/*
 * LispList.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 9
 *
 * Description:
 * program acts as an interface with several methods - empty, head, tail, cons, length, merge,
 * contains, and append
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

public interface LispList {
    EmptyList NIL = new EmptyList();
    boolean empty();
    Object head();
    LispList tail();
    LispList cons(Object obj);
    int length();
    LispList merge(LispList other);
    boolean contains(Object obj);
    LispList append(LispList other);
}//end public interface LispList
