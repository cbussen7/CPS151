import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args){
        /*
        try {
            Scanner input = new Scanner(System.in);

            int x = input.nextInt();
        }
        catch(InputMismatchException ex){
            System.out.println("Enter an int");
        }
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int x = input.nextInt();

        System.out.print("Enter a word: ");
        String y = input.next();
    }
}
