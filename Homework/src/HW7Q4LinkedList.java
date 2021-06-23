import java.util.LinkedList;

public class HW7Q4LinkedList {
    public static void main(String[] args){
        LinkedList<String> staff = new LinkedList<>();

        staff.addFirst("Harry");
        staff.addFirst("Diana");
        staff.addFirst("Tom");
        System.out.println(staff.removeFirst());
        System.out.println(staff.removeFirst());
        System.out.println(staff.removeFirst());
        //System.out.println(staff.removeFirst());

    }
}
