import java.util.HashSet;
import java.util.Set;

public class HW7Q9IntersectionAndUnionOfSet {
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>();
        for(int i = 0; i < 9; i++){
            set1.add(i);
        }
        System.out.println("Set 1: " + set1);

        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < 8; i++){
            if(i%2 != 0){
                set2.add(2*i);
            }
        }
        System.out.println("Set 2: " + set2);

        //use addAll method to create union
        set1.addAll(set2);
        System.out.println("Union of set 1 and set 2: " + set1);


        Set<Integer> set3 = new HashSet<>();
        for(int i = 0; i < 9; i++){
            set3.add(i);
        }
        System.out.println("Set 3: " + set3);

        Set<Integer> set4 = new HashSet<>();
        for(int i = 0; i < 8; i++){
            if(i%2 != 0){
                set4.add(i);
            }
        }
        System.out.println("Set 4: " + set4);

        //use retainAll method to create intersection
        set3.retainAll(set4);
        System.out.println("Intersection of set 3 and set 4: " + set3);
    }
}
