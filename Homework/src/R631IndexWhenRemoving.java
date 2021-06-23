import java.util.ArrayList;

public class R631IndexWhenRemoving {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();
        words.add("welcome");
        words.add("to");
        words.add("the");
        words.add("island");
        words.add("boy");

        //traverse loop backwards to avoid skipping indices when removing elements
        //if you go backwards, removing a later element will only affect indices of those after it (which have already been checked)
        for (int i = words.size()-1; i >= 0; i--)
        {
            String word = words.get(i);
            if (word.length() < 4)
            {
                //Remove the element at index i.
                words.remove(i);
            }
        }
    }
}
