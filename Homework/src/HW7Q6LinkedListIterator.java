import java.util.LinkedList;
import java.util.ListIterator;

public class HW7Q6LinkedListIterator {
    public static void main(String[] args){
        LinkedList<String> staff = new LinkedList<>();
        staff.addFirst("Harry");
        staff.addLast("Diana");
        staff.addFirst("Tom");

        ListIterator<String> iter = staff.listIterator();

        while(iter.hasNext()){
            if(iter.next().length() <= 3){
                iter.remove();
            }
        }

        for(String names : staff){
            System.out.println(names);
        }
    }
}
