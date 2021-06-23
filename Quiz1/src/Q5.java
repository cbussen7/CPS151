import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Bob");
        names.add(0, "Ann");
        names.remove(1);
        names.add("Cal");
        names.set(1, "Tony");
        for (String s : names)
        {
            System.out.print(s + ", ");
        }


    }
}
