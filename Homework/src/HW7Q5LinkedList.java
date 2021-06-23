import java.util.LinkedList;

public class HW7Q5LinkedList {
    public static void main(String[] args){
        LinkedList<String> staff = new LinkedList<>();
        staff.addFirst("Harry");
        staff.addLast("Diana");
        staff.addFirst("Tom");
        System.out.println(staff.removeLast());
        System.out.println(staff.removeFirst());
        System.out.println(staff.removeLast());
    }
}
