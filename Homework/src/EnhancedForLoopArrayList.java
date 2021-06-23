import java.util.ArrayList;

public class EnhancedForLoopArrayList {
    public static void main(String [] args){
        int[] values = {110, 90, 100, 120, 80};

        ArrayList<Double> matches = new ArrayList<Double>();
        for (double element : values)
        {
            if (element > 100)
            {
                matches.add(element);
            }
        }

        System.out.println(matches);

    }
}
