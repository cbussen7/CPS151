import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> inputs = new ArrayList<Double>();
        int ind = 0;
        System.out.print("Enter doubles: ");
        while (in.hasNextDouble())
        {
            // what would work:
            inputs.add(in.nextDouble());
            //inputs.set(ind, in.nextDouble()); // can't set no elements
            ind++;
        }
    }
}
