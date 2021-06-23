public class HW6RecursiveLinearSearch {
    public static void main(String[] args){
        int[] numArray = {22, 43, 6, 99, 25, 76, 1, 2, 5, 102, 69};

        System.out.println(RecursiveLinearSearch(numArray, 0, 69));

    }

    public static int RecursiveLinearSearch(int[] x, int start, int desired){
        //return -1 if program goes through array and doesn't find desired value
        if(start >= x.length){
            return -1;
        }
        //if current index of array contains desired value, return index
        else if(x[start] == desired){
            return start;
        }
        //otherwise, call recursive method using same array, start+1, and same desired value
        else{
            return RecursiveLinearSearch(x, start+1, desired);
        }
    }//end RecursiveLinearSearch
}
