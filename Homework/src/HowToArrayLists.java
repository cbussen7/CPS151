import java.util.ArrayList;

public class HowToArrayLists {
    public static void main(String[] args) {
        //check if two array lists have same elements in same order
        ArrayList<Integer> val1 = new ArrayList<>();
        ArrayList<Integer> val2 = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            val1.add(i);
            val2.add(i);
        }
        val2.set(0, 5);
        if (val1.equals(val2)) {
            System.out.println("Array lists are equal");
        } else {
            System.out.println("Array lists not equal");
        }
        //System.out.println(val1.equals(val2));

        //copy one array list to another
        ArrayList<Integer> val3 = new ArrayList<>(val2);
        System.out.println(val3);

        //fill an array list w 0, overwriting all elements
        for(int i = 0; i < val1.size(); i++){
            val1.set(i, 0);
        }
        System.out.println(val1);

        //remove all elements from an array list
        /* backwards for loop
        for(int i = val1.size() - 1; i >= 0; i--){
            val1.remove(i);
        }
        System.out.println(val1);
         */

        //removeAll method
        /*
        val1.removeAll(val1);
        System.out.println(val1);
         */

        //clear method
        val1.clear();
        System.out.println(val1);
    }
}
