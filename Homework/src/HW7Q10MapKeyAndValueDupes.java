import java.util.HashMap;
import java.util.Map;

public class HW7Q10MapKeyAndValueDupes {
    public static void main(String[] args){
        Map<String, String> relationships = new HashMap<>();

        relationships.put("Mom", "Julie");
        relationships.put("Friend", "Julie");
        relationships.put("Mom", "Anne");

        System.out.println(relationships);
    }
}
