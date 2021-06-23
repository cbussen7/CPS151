import java.util.ArrayList;

public class ArrayListNumberCounterRecursion {
    public static void main(String[] args){
        ArrayList<Integer> empty = new ArrayList<>();

        ArrayList<Integer> example = new ArrayList<>(makeList(5, empty));

        System.out.println(example);

    }

    public static ArrayList<Integer> makeList (int n, ArrayList<Integer> tempList){
        //ArrayList<Integer> tempList = new ArrayList<>();
        if(n <= 0){
            return tempList;
        }
        if(n == 1){
            tempList.add(1);
        }
        else{
            makeList(n-1, tempList);
            tempList.add(n);
        }
        return tempList;
    }
}
