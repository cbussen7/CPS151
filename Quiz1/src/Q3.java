import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jerry");
        ArrayList<String> friends = names;
        friends.add("Harry");

        System.out.println(names.size());
        System.out.println(friends.size());
    }
}
