import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        try
        {
            String filename = "input.txt";
            Scanner in = new Scanner(new File(filename));
        }
        catch (FileNotFoundException exception)
        {
            exception.printStackTrace();
            //System.out.println("Error");
        }
    }
}
