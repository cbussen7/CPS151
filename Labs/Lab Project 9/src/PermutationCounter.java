/*
 * PermutationCounter.java
 * Christopher Bussen, bussenc1
 */

public class PermutationCounter {
    private int n;

    public PermutationCounter(int numberOfItems) {
        n = numberOfItems;
    }

    /**
     * method counts the number of permutations for n items using recursion
     * @return number of permutations
     */
    public long getCount() {
        if(n <= 0){
            return 1;
        }
        else{
            //decrement n
            n--;
            //call getCount and multiply by n+1
            return (n+1) * getCount();
        }
    }//end getCount method
}//end public class PermutationCounter
